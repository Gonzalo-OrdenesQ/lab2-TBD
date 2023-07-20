package cl.tbd.voluntariado.services;

import cl.tbd.voluntariado.models.Voluntario;
import cl.tbd.voluntariado.repositories.VoluntarioRepositoryImp;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.TypedAggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voluntarios")
public class VoluntarioService {

    @Autowired
    private VoluntarioRepositoryImp voluntarioRepository;

    @Autowired
    MongoOperations mongoOperations;

    @GetMapping
    public List<Voluntario> getVoluntarios(){
        return voluntarioRepository.getVoluntarios();
    }

    @GetMapping("/{id}")
    public Voluntario getVoluntario(@PathVariable("id") String id){
        return voluntarioRepository.getVoluntario(id);
    }

    @PostMapping
    public Voluntario createVoluntario(@RequestBody Voluntario voluntario){
        return voluntarioRepository.createVoluntario(voluntario);
    }

    @PutMapping
    public Voluntario updateVoluntario(@RequestBody Voluntario voluntario){
        return voluntarioRepository.updateVoluntario(voluntario.get_id().toString(), voluntario.getNombre(), voluntario.getApellido(), voluntario.getCorreo_electronico());
    }

    @DeleteMapping("/{id}")
    public void deleteVoluntario(@PathVariable("id") String id){
        voluntarioRepository.deleteVoluntarioById(id);
    }

    @GetMapping("/by-tarea/{id}")
    public List<Voluntario> geVoluntariosByTarea(@PathVariable("id") String id){
        TypedAggregation<Voluntario> aggregation = Aggregation.newAggregation(Voluntario.class,
            Aggregation.lookup("ranking", "_id", "id_voluntario", "ranking"),
            Aggregation.unwind("$ranking"),
            Aggregation.match(Criteria.where("ranking.id_tarea").is(new ObjectId(id))),
            Aggregation.project("_id", "nombre", "apellido", "password", "correo_electronico")
        );

        AggregationResults<Voluntario> results = mongoOperations.aggregate(aggregation, Voluntario.class);

        return results.getMappedResults();
    }
}

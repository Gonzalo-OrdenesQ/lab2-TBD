package cl.tbd.voluntariado.services;

import cl.tbd.voluntariado.models.Voluntario;
import cl.tbd.voluntariado.repositories.VoluntarioRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voluntarios")
public class VoluntarioService {

    @Autowired
    private VoluntarioRepositoryImp voluntarioRepository;

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
}

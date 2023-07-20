package cl.tbd.voluntariado.services;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
@RestController
@RequestMapping("/ranking")
public class RankingService {
    MongoDatabase mongoDatabase;

    

    @GetMapping("/voluntarios-por-tarea")
    public List<Document> obtenerVoluntariosPorTarea(@RequestParam String idTarea) {
        System.out.println("sdasdasd");
        ObjectId tareaId = new ObjectId(idTarea);
        MongoCollection<Document> voluntariosCollection = mongoDatabase.getCollection("voluntarios");

        List<Document> pipeline = new ArrayList<>();
        pipeline.add(new Document("$lookup",
                new Document("from", "ranking")
                        .append("localField", "_id")
                        .append("foreignField", "id_voluntario")
                        .append("as", "ranking")));

        pipeline.add(new Document("$unwind", "$ranking"));

        pipeline.add(new Document("$match",
                new Document("ranking.id_tarea", tareaId)));

        pipeline.add(new Document("$project",
                new Document("_id", 1L)
                        .append("nombre", 1L)
                        .append("apellido", 1L)
                        .append("password", 1L)
                        .append("correo_electronico", 1L)));

        return voluntariosCollection.aggregate(pipeline).into(new ArrayList<>());
    }
}

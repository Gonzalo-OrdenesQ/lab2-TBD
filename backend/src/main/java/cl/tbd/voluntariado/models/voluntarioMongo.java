package cl.tbd.voluntariado.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "voluntario")
public class voluntarioMongo {
    @Id
    private String id;
    private String nombre;
    private String apellido;
}

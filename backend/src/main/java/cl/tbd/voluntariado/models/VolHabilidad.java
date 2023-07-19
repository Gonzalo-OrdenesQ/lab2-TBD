package cl.tbd.voluntariado.models;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

public class VolHabilidad {
    @BsonId
    private ObjectId _id;

    private String id_voluntario;
    private String id_habilidad;

    public VolHabilidad() {
    }

    public VolHabilidad(ObjectId _id, String id_voluntario, String id_habilidad) {
        this._id = _id;
        this.id_voluntario = id_voluntario;
        this.id_habilidad = id_habilidad;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getId_voluntario() {
        return id_voluntario;
    }

    public void setId_voluntario(String id_voluntario) {
        this.id_voluntario = id_voluntario;
    }

    public String getId_habilidad() {
        return id_habilidad;
    }

    public void setId_habilidad(String id_habilidad) {
        this.id_habilidad = id_habilidad;
    }
}

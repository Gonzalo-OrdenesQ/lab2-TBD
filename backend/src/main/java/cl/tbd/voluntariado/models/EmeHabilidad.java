package cl.tbd.voluntariado.models;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

public class EmeHabilidad {

    @BsonId
    ObjectId _id;

    private String id_emergencia;
    private String id_habilidad;

    public EmeHabilidad() {
    }

    public EmeHabilidad(ObjectId _id, String id_emergencia, String id_habilidad) {
        this._id = _id;
        this.id_emergencia = id_emergencia;
        this.id_habilidad = id_habilidad;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getId_emergencia() {
        return id_emergencia;
    }

    public void setId_emergencia(String id_emergencia) {
        this.id_emergencia = id_emergencia;
    }

    public String getId_habilidad() {
        return id_habilidad;
    }

    public void setId_habilidad(String id_habilidad) {
        this.id_habilidad = id_habilidad;
    }
}

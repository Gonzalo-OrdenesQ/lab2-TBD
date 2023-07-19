package cl.tbd.voluntariado.models;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

public class TareaHabilidad {
    @BsonId
    private ObjectId _id;

    private String id_emehab;
    private String id_tarea;

    public TareaHabilidad() {
    }

    public TareaHabilidad(ObjectId _id, String id_emehab, String id_tarea) {
        this._id = _id;
        this.id_emehab = id_emehab;
        this.id_tarea = id_tarea;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getId_emehab() {
        return id_emehab;
    }

    public void setId_emehab(String id_emehab) {
        this.id_emehab = id_emehab;
    }

    public String getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(String id_tarea) {
        this.id_tarea = id_tarea;
    }
}

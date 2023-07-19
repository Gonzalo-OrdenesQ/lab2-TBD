package cl.tbd.voluntariado.models;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

public class Ranking {

    @BsonId
    private ObjectId _id;

    private String id_voluntario;
    private String id_tarea;
    private int puntos;
    private String created_at;
    private String updated_at;

    public Ranking() {
    }

    public Ranking(ObjectId _id, String id_voluntario, String id_tarea, int puntos, String created_at, String updated_at) {
        this._id = _id;
        this.id_voluntario = id_voluntario;
        this.id_tarea = id_tarea;
        this.puntos = puntos;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public String getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(String id_tarea) {
        this.id_tarea = id_tarea;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}

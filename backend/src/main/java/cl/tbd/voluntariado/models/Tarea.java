package cl.tbd.voluntariado.models;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

public class Tarea {
    @BsonId
    private ObjectId _id;

    private String nombre;
    private String descripcion;
    private String id_estado_tarea;
    private String created_at;
    private String updated_at;
    private String id_emergencia;

    public Tarea() {
    }

    public Tarea(ObjectId _id, String nombre, String descripcion, String id_estado_tarea, String created_at, String updated_at, String id_emergencia) {
        this._id = _id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id_estado_tarea = id_estado_tarea;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.id_emergencia = id_emergencia;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setId_estado_tarea(String id_estado_tarea) {
        this.id_estado_tarea = id_estado_tarea;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public void setId_emergencia(String id_emergencia) {
        this.id_emergencia = id_emergencia;
    }
}

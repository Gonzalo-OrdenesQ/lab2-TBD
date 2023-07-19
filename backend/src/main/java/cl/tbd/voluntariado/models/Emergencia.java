package cl.tbd.voluntariado.models;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

public class Emergencia {

    @BsonId
    ObjectId _id;

    private String nombre;
    private String ubicacion;
    private String fecha;
    private String descripcion;
    private String created_at;
    private String updated_at;

    public Emergencia(ObjectId _id, String nombre, String ubicacion, String fecha, String descripcion, String created_at, String updated_at) {
        this._id = _id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Emergencia() {
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

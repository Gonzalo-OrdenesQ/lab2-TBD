package cl.tbd.voluntariado.models;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

public class Coordinador {

    @BsonId
    private ObjectId _id;

    private String nombre;
    private String apellido;
    private String estado_salud;
    private String password;
    private String correo_electronico;
    private String id_institucion;
    private String created_at;
    private String updated_at;

    public Coordinador() {
    }

    public Coordinador(ObjectId _id, String nombre, String apellido, String estado_salud, String password, String correo_electronico, String id_institucion, String created_at, String updated_at) {
        this._id = _id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado_salud = estado_salud;
        this.password = password;
        this.correo_electronico = correo_electronico;
        this.id_institucion = id_institucion;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstado_salud() {
        return estado_salud;
    }

    public void setEstado_salud(String estado_salud) {
        this.estado_salud = estado_salud;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getId_institucion() {
        return id_institucion;
    }

    public void setId_institucion(String id_institucion) {
        this.id_institucion = id_institucion;
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

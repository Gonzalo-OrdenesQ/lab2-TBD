package cl.tbd.voluntariado.models;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

public class VolRanking {
    @BsonId
    private ObjectId _id;

    private String estado_salud;
    private String nombre;
    private String apellido;
    private String correo_electronico;
    private int puntos;

    public VolRanking() {
    }

    public VolRanking(ObjectId _id, String estado_salud, String nombre, String apellido, String correo_electronico, int puntos) {
        this._id = _id;
        this.estado_salud = estado_salud;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo_electronico = correo_electronico;
        this.puntos = puntos;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getEstado_salud() {
        return estado_salud;
    }

    public void setEstado_salud(String estado_salud) {
        this.estado_salud = estado_salud;
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

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}

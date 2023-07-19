package cl.tbd.voluntariado.models;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

public class Institucion {
    @BsonId
    private ObjectId _id;

    private String nombre;
    private String descrip;

    public Institucion() {
    }

    public Institucion(ObjectId _id, String nombre, String descrip) {
        this._id = _id;
        this.nombre = nombre;
        this.descrip = descrip;
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

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
}

package cl.tbd.voluntariado.models;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

public class Habilidad {

    @BsonId
    private ObjectId _id;

    private String descrip;

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public Habilidad(ObjectId _id, String descrip) {
        this._id = _id;
        this.descrip = descrip;
    }

    public Habilidad() {
    }
}

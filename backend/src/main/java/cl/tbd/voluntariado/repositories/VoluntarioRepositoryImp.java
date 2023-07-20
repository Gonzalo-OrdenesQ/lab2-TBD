package cl.tbd.voluntariado.repositories;

import java.util.ArrayList;
import java.util.List;

import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

import cl.tbd.voluntariado.models.Voluntario;

@Repository
public class VoluntarioRepositoryImp implements VoluntarioRepository{
    @Autowired
    MongoDatabase database;

    @Override
    //create
    public Voluntario createVoluntario(Voluntario v){
        MongoCollection<Voluntario> collection = database.getCollection("voluntario", Voluntario.class);
        collection.insertOne(v);
        return v;
    }
    //delete
    @Override
    public void deleteVoluntarioById(String id){
        MongoCollection<Voluntario> collection = database.getCollection("voluntario", Voluntario.class);
        collection.deleteOne(Filters.eq("_id", new ObjectId(id)));
    }
    //read
    @Override
    public Voluntario getVoluntario(String id){
        MongoCollection<Voluntario> collection = database.getCollection("voluntario", Voluntario.class);
        Bson filter = Filters.eq("_id", new ObjectId(id));
        return collection.find(filter).first();
    }

    @Override
    public Voluntario updateVoluntario(String id, String nombre, String apellido, String correo_electronico) {
        MongoCollection<Voluntario> collection = database.getCollection("voluntario", Voluntario.class);
        Bson filter = Filters.eq("_id", new ObjectId(id));
        List<Bson> updates = new ArrayList<>();

        if (nombre != null) {
            updates.add(Updates.set("nombre", nombre));
        }
        if (apellido != null) {
            updates.add(Updates.set("apellido", apellido));
        }
        if (correo_electronico != null) {
            updates.add(Updates.set("correo_electronico", correo_electronico));
        }

        Bson update = Updates.combine(updates);
        collection.updateOne(filter, update);
        return collection.find(filter).first();
    }

    public List<Voluntario> getVoluntarios(){
        MongoCollection<Voluntario> collection = database.getCollection("voluntario", Voluntario.class);
        List<Voluntario> voluntarios = collection.find().into(new ArrayList<>());
        return voluntarios;
    }

}

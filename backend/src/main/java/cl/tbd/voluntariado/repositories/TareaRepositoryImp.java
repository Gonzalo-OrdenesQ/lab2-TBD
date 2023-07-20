package cl.tbd.voluntariado.repositories;

import java.sql.Date;
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

import cl.tbd.voluntariado.models.Tarea;
import cl.tbd.voluntariado.models.Voluntario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class TareaRepositoryImp implements TareaRepository{
    @Autowired
    MongoDatabase database;

    @Override
    public Tarea createTarea(Tarea tarea){
        MongoCollection<Tarea> collection = database.getCollection("tarea", Tarea.class);
        collection.insertOne(tarea);
        return tarea;
    }
    @Override
    public void deleteTarea(String id){
        MongoCollection<Tarea> collection = database.getCollection("tarea", Tarea.class);
        collection.deleteOne(Filters.eq("_id", new ObjectId(id)));
    }
    @Override
    public Tarea getTarea(String id){
        MongoCollection<Tarea> collection = database.getCollection("tarea", Tarea.class);
        Bson filter = Filters.eq("_id", new ObjectId(id));
        return collection.find(filter).first();
    }


    @Override
    public Tarea updateTarea(String id, String nombre, String descrip, String id_estado_tarea,
                         Integer cant_vol_requeridos, Integer cant_vol_inscritos,
                         Date fecha_inicio, Date fecha_fin, String emergencia) {
    MongoCollection<Tarea> collection = database.getCollection("tarea", Tarea.class);
    Bson filter = Filters.eq("_id", new ObjectId(id));
    List<Bson> updates = new ArrayList<>();

    if (nombre != null) {
        updates.add(Updates.set("name", nombre));
    }
    if (descrip != null) {
        updates.add(Updates.set("descrip", descrip));
    }
    if (id_estado_tarea != null) {
        updates.add(Updates.set("estado", id_estado_tarea));
    }
    if (cant_vol_requeridos != null) {
        updates.add(Updates.set("cant_vol_requeridos", cant_vol_requeridos));
    }
    if (cant_vol_inscritos != null) {
        updates.add(Updates.set("cant_vol_inscritos", cant_vol_inscritos));
    }
    if (fecha_inicio != null) {
        updates.add(Updates.set("fecha_inicio", fecha_inicio));
    }
    if (fecha_fin != null) {
        updates.add(Updates.set("fecha_fin", fecha_fin));
    }
    if (emergencia != null) {
        updates.add(Updates.set("emergencia", emergencia));
    }

    Bson update = Updates.combine(updates);
    collection.updateOne(filter, update);
    return collection.find(filter).first();
    }

    @Override
    public List<Tarea> getTareas(){
        MongoCollection<Tarea> collection = database.getCollection("tarea", Tarea.class);
        List<Tarea> tareas = collection.find().into(new ArrayList<>());
        return tareas;
    }
}

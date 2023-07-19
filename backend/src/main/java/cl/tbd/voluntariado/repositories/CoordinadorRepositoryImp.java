package cl.tbd.voluntariado.repositories;

import cl.tbd.voluntariado.models.Coordinador;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CoordinadorRepositoryImp implements CoordinadorRepository{

    @Autowired
    MongoDatabase database;

    @Override
    public int countCoordinadores(){

        MongoCollection<Document> collection = database.getCollection("coordinador");
        long count = collection.countDocuments();
        return (int) count;
    }

    @Override
    public List<Coordinador> getCoordinadores(){
        MongoCollection<Coordinador> collection = database.getCollection("coordinador", Coordinador.class);
        List<Coordinador> coordinadores = collection.find().into(new ArrayList<>());
        return coordinadores;
    }

    @Override
    public Coordinador createCoordinador(Coordinador coordinador){
        MongoCollection<Coordinador> collection = database.getCollection("coordinador", Coordinador.class);
        collection.insertOne(coordinador);
        return coordinador;
    }
}

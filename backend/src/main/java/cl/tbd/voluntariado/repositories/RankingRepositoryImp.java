package cl.tbd.voluntariado.repositories;

import cl.tbd.voluntariado.models.Ranking;
import cl.tbd.voluntariado.models.Voluntario;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RankingRepositoryImp implements RankingRepository{

    @Autowired
    MongoDatabase database;

    @Override
    public Ranking createRanking(Ranking r) {
        MongoCollection<Ranking> collection = database.getCollection("ranking",Ranking.class);
        collection.insertOne(r);
        return r;
    }

    @Override
    public void deleteRankingById(String id) {
        MongoCollection<Ranking> collection = database.getCollection("ranking", Ranking.class);
        collection.deleteOne(Filters.eq("_id", new ObjectId(id)));
    }

    @Override
    public Ranking getRanking(String id) {
        MongoCollection<Ranking> collection = database.getCollection("ranking", Ranking.class);
        Bson filter = Filters.eq("_id", new ObjectId(id));
        return collection.find(filter).first();
    }

    @Override
    public Ranking updateRanking(String id, String id_voluntario, String id_tarea, int puntos, String created_at, String updated_at) {
        MongoCollection<Ranking> collection = database.getCollection("ranking",Ranking.class);
        Bson filter = Filters.eq("_id", new ObjectId(id));
        List<Bson> updates = new ArrayList<>();

        if (id_voluntario != null)
            updates.add(Updates.set("id_voluntario", id_voluntario));
        if (id_tarea != null)
            updates.add(Updates.set("id_tarea", id_tarea));
        if (Integer.valueOf(puntos) != null)
            updates.add(Updates.set("puntos", puntos));
        if (created_at != null)
            updates.add(Updates.set("created_at", created_at));
        if (updated_at != null)
            updates.add(Updates.set("updated_at", updated_at));

        Bson update = Updates.combine(updates);
        collection.updateOne(filter,update);
        return collection.find(filter).first();
    }

    @Override
    public List<Ranking> getRankings() {
        MongoCollection<Ranking> collection = database.getCollection("ranking",Ranking.class);
        List<Ranking> voluntarios = collection.find().into(new ArrayList<>());
        return voluntarios;
    }
}

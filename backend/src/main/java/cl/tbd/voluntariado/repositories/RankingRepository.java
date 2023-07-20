package cl.tbd.voluntariado.repositories;


import cl.tbd.voluntariado.models.Ranking;

import java.util.List;

public interface RankingRepository {

    public Ranking createRanking(Ranking v);
    public void deleteRankingById(String id);
    public Ranking getRanking(String id);
    public Ranking updateRanking(String id, String id_voluntario, String id_tarea, int puntos, String created_at, String updated_at);
    public List<Ranking> getRankings();
}

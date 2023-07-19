package cl.tbd.voluntariado.repositories;


import cl.tbd.voluntariado.models.Coordinador;

import java.util.List;

public interface CoordinadorRepository {
    public int countCoordinadores();
    public List<Coordinador> getCoordinadores();
    public Coordinador createCoordinador(Coordinador coordinador);
}

package cl.tbd.voluntariado.repositories;

import java.sql.Date;
import java.util.List;

import cl.tbd.voluntariado.models.Tarea;

public interface TareaRepository {
    public Tarea createTarea(Tarea tarea);
    public List<Tarea> getTareas();
    public void deleteTarea(String id);
    public Tarea getTarea(String id);
    public Tarea updateTarea(String id, String nombre, String descrip, String id_estado_tarea,
                         Integer cant_vol_requeridos, Integer cant_vol_inscritos,
                         Date fecha_inicio, Date fecha_fin, String emergencia);
}

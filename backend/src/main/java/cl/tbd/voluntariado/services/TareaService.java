package cl.tbd.voluntariado.services;

import cl.tbd.voluntariado.models.Tarea;
import cl.tbd.voluntariado.repositories.TareaRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TareaService {

    @Autowired
    TareaRepositoryImp tareaRepository;

    @GetMapping("/{id}")
    public Tarea getTarea(@PathVariable("id") String id){
        Tarea tarea = tareaRepository.getTarea(id);
        return tarea;
    }

    @GetMapping
    public List<Tarea> getTareas(){
        return tareaRepository.getTareas();
    }

    @PostMapping
    public Tarea createTarea(@RequestBody Tarea tarea){
        return tareaRepository.createTarea(tarea);
    }

    @PutMapping
    public Tarea updateTarea(@RequestBody Tarea tarea){
        return tareaRepository.updateTarea(tarea.get_id(),tarea.getName(),tarea.getDescrip(),tarea.getEstado(),tarea.getCant_vol_requeridos(),tarea.getCant_vol_inscritos(),tarea.getFecha_inicio(),tarea.getFecha_fin(),tarea.getEmergencia());
    }

    @DeleteMapping("/{id}")
    public void deleteTarea(@PathVariable("id") String id){
        tareaRepository.deleteTarea(id);
    }
}

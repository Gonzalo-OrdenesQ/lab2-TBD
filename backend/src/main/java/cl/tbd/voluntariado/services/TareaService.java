package cl.tbd.voluntariado.services;

import cl.tbd.voluntariado.models.Tarea;
import cl.tbd.voluntariado.repositories.TareaRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tareas")
public class TareaService {

    @Autowired
    TareaRepositoryImp tareaRepository;

    @GetMapping("/{id}")
    public Tarea getTarea(@PathVariable("id") String id){
        System.out.println("hola mundo");
        Tarea tarea = tareaRepository.getTarea(id);
        return tarea;
    }
}

package cl.tbd.voluntariado.models;

import java.sql.Date;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

public class Tarea {
    @BsonId
    private ObjectId _id;

    private String nombre;
    private String descrip;
    private String id_estado_tarea;
    private int cant_vol_requeridos;
    private int cant_vol_inscritos;
    private Date fecha_inicio; 
    private Date fecha_fin;
    private String emergencia;

    public Tarea() {
    }

    public Tarea(ObjectId _id, String nombre, String descripcion, int cant_vol_requeridos, int cant_vol_inscritos,  String id_estado_tarea, Date fecha_inicio, Date fecha_fin, String emergencia) {
        this._id = _id;
        this.nombre = nombre;
        this.descrip = descripcion;
        this.id_estado_tarea = id_estado_tarea;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.cant_vol_inscritos = cant_vol_inscritos;
        this.cant_vol_requeridos = cant_vol_requeridos;
        this.emergencia = emergencia;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descrip = descripcion;
    }

    public void setId_estado_tarea(String id_estado_tarea) {
        this.estado_tarea = id_estado_tarea;
    }

    public void setFechafin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public void setFechainicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setemergencia(String emergencia) {
        this.emergencia = emergencia;
    }

    public void setCantVolRequeridos(int volreq) {
        this.cant_vol_requeridos = volreq;
    }

    public void setCantVolInscritos(int volins) { 
        this.cant_vol_inscritos = volins;
    }
}

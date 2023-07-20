package cl.tbd.voluntariado.models;

import java.sql.Date;

import org.bson.codecs.pojo.annotations.BsonId;

public class Tarea {
    @BsonId
    private String _id;

    private String name;
    private String descripcion;
    private int cantVolRequeridos;
    private int cantVolInscritos;
    private Date fechainicio;
    private Date fechafin;
    private String estado;
    private String emergencia;

    public Tarea() {
    }

    public Tarea(String _id, String name, String descripcion, int cant_vol_requeridos, int cant_vol_inscritos,  String estado, Date fecha_inicio, Date fecha_fin, String emergencia) {
        this._id = _id;
        this.name = name;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechainicio = fecha_inicio;
        this.fechafin = fecha_fin;
        this.cantVolInscritos = cant_vol_inscritos;
        this.cantVolRequeridos = cant_vol_requeridos;
        this.emergencia = emergencia;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechafin(Date fecha_fin) {
        this.fechafin = fecha_fin;
    }

    public void setFechainicio(Date fecha_inicio) {
        this.fechainicio = fecha_inicio;
    }

    public void setemergencia(String emergencia) {
        this.emergencia = emergencia;
    }

    public void setCantVolRequeridos(int volreq) {
        this.cantVolRequeridos = volreq;
    }

    public void setCantVolInscritos(int volins) { 
        this.cantVolInscritos = volins;
    }

    public String get_id() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantVolRequeridos() {
        return cantVolRequeridos;
    }

    public int getCantVolInscritos() {
        return cantVolInscritos;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public String getEstado() {
        return estado;
    }

    public String getEmergencia() {
        return emergencia;
    }
}

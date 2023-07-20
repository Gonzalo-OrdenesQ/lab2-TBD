package cl.tbd.voluntariado.models;

import java.sql.Date;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

public class Tarea {
    @BsonId
    private String _id;

    private String name;
    private String descrip;
    private int cant_vol_requeridos;
    private int cant_vol_inscritos;
    private Date fecha_inicio; 
    private Date fecha_fin;
    private String estado;
    private String emergencia;

    public Tarea() {
    }

    public Tarea(String _id, String name, String descripcion, int cant_vol_requeridos, int cant_vol_inscritos,  String estado, Date fecha_inicio, Date fecha_fin, String emergencia) {
        this._id = _id;
        this.name = name;
        this.descrip = descripcion;
        this.estado = estado;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.cant_vol_inscritos = cant_vol_inscritos;
        this.cant_vol_requeridos = cant_vol_requeridos;
        this.emergencia = emergencia;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescripcion(String descripcion) {
        this.descrip = descripcion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public String get_id() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public String getDescrip() {
        return descrip;
    }

    public int getCant_vol_requeridos() {
        return cant_vol_requeridos;
    }

    public int getCant_vol_inscritos() {
        return cant_vol_inscritos;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public String getEstado() {
        return estado;
    }

    public String getEmergencia() {
        return emergencia;
    }
}

package cl.tbd.voluntariado.repositories;

import cl.tbd.voluntariado.models.Voluntario;

public interface VoluntarioRepository {
    public Voluntario createVoluntario(Voluntario v);
    public void deleteVoluntarioById(String id);
    public Voluntario getVoluntario(String id);
    public Voluntario updateVoluntario(String id, String nombre, String apellido, String correo_electronico);
}

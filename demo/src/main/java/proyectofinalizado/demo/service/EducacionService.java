package proyectofinalizado.demo.service;

import proyectofinalizado.demo.entity.Educacion;

import java.util.List;
import java.util.Optional;

public interface EducacionService {

    public List<Educacion> findAllEducacion();

    public Educacion update(Educacion educacion);

    Optional<Educacion> educacionUnica(Long id);
    public Educacion guardar(Educacion educacion);
    public void eliminar(Long id);
}

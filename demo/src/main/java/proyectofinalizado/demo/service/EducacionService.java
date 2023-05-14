package proyectofinalizado.demo.service;

import proyectofinalizado.demo.entity.Educacion;

import java.util.List;
import java.util.Optional;

public interface EducacionService {

    List<Educacion> findAllEducacion();

    Educacion update(Educacion educacion);

    Optional<Educacion> educacionUnica(Long id);
    Educacion guardar(Educacion educacion);
    void eliminar(Long id);
}

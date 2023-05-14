package proyectofinalizado.demo.service;

import proyectofinalizado.demo.entity.Experiencia;
import proyectofinalizado.demo.entity.Proyecto;


import java.util.List;
import java.util.Optional;

public interface ProyectoService {


    List<Proyecto> findAllProyects();

    Proyecto update(Proyecto proyecto);

    Optional<Proyecto> proyectoUnico(Long id);
    Proyecto guardar(Proyecto proyecto);
    void eliminar(Long id);
}

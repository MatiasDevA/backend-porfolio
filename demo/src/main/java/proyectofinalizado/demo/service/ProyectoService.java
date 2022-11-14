package proyectofinalizado.demo.service;

import proyectofinalizado.demo.entity.Experiencia;
import proyectofinalizado.demo.entity.Proyecto;


import java.util.List;
import java.util.Optional;

public interface ProyectoService {


    public List<Proyecto> findAllProyects();

    public Proyecto update(Proyecto proyecto);

    Optional<Proyecto> proyectoUnico(Long id);
    public Proyecto guardar(Proyecto proyecto);
    public void eliminar(Long id);
}

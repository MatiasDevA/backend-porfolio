package proyectofinalizado.demo.service;

import proyectofinalizado.demo.entity.Publicacion;

import java.util.List;
import java.util.Optional;

public interface PublicacionService {

    List<Publicacion> verPublicaciones();


    Publicacion guardar(Publicacion publicacion);


    void update(Publicacion publicacion);


    void eliminar(Integer id);

    Optional<Publicacion> publicacionUnica(Integer id);
}

package proyectofinalizado.demo.service;

import proyectofinalizado.demo.entity.Publicacion;

import java.util.List;
import java.util.Optional;

public interface PublicacionService {

    public List<Publicacion> verPublicaciones();


    public Publicacion guardar(Publicacion publicacion);


    public void update(Publicacion publicacion);


    public void eliminar(Integer id);

    public Optional<Publicacion> publicacionUnica(Integer id);
}

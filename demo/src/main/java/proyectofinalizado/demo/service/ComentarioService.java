package proyectofinalizado.demo.service;

import proyectofinalizado.demo.entity.Comentario;
import proyectofinalizado.demo.entity.Publicacion;

import java.util.List;

public interface ComentarioService {

    public List<Comentario> verComentarios();


    public Comentario guardar(Comentario comentario);


    public void update(Comentario comentario);


    public void eliminar(Integer id);
    List<Comentario> listarComentariosDeUnaPublicacion(Publicacion publicacion);

}

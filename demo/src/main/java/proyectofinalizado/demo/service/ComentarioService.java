package proyectofinalizado.demo.service;

import proyectofinalizado.demo.entity.Comentario;
import proyectofinalizado.demo.entity.Publicacion;

import java.util.List;

public interface ComentarioService {

    List<Comentario> verComentarios();


    Comentario guardar(Comentario comentario);


    void update(Comentario comentario);


    void eliminar(Integer id);
    List<Comentario> listarComentariosDeUnaPublicacion(Publicacion publicacion);

}

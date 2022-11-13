package proyectofinalizado.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectofinalizado.demo.entity.Comentario;
import proyectofinalizado.demo.entity.Publicacion;
import proyectofinalizado.demo.repository.ComentarioRepository;

import java.util.List;

@Service
public class ComentarioServiceIMPL implements  ComentarioService{

    @Autowired
    ComentarioRepository comentarioRepository;

    @Override
    public List<Comentario> verComentarios() {
        return comentarioRepository.findAll();
    }

    @Override
    public Comentario guardar(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    @Override
    public void update(Comentario comentario) {
        comentarioRepository.save(comentario);
    }

    @Override
    public void eliminar(Integer id) {
        comentarioRepository.deleteById(id);
    }

    @Override
    public List<Comentario> listarComentariosDeUnaPublicacion(Publicacion publicacion) {
        return this.comentarioRepository.findByPublicacion(publicacion);
    }
}
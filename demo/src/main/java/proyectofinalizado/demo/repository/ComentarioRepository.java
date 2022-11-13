package proyectofinalizado.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyectofinalizado.demo.entity.Comentario;
import proyectofinalizado.demo.entity.Publicacion;

import java.util.List;


@Repository
public interface ComentarioRepository  extends JpaRepository<Comentario, Integer> {

    List<Comentario> findByPublicacion(Publicacion publicacion);
}

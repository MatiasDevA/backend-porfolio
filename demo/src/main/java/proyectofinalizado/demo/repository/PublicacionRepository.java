package proyectofinalizado.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyectofinalizado.demo.entity.Publicacion;

@Repository
public interface PublicacionRepository  extends JpaRepository<Publicacion, Integer> {
}

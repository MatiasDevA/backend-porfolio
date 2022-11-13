package proyectofinalizado.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyectofinalizado.demo.entity.Educacion;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion,Long> {
}

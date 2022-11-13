package proyectofinalizado.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyectofinalizado.demo.entity.Experiencia;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia,Long> {


}
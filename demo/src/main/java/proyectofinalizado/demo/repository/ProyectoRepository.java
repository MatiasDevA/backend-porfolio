package proyectofinalizado.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyectofinalizado.demo.entity.Proyecto;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto,Long> {
}

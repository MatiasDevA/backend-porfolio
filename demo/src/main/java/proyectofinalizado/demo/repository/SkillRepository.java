package proyectofinalizado.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyectofinalizado.demo.entity.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill,Long> {
}

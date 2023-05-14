package proyectofinalizado.demo.service;

import proyectofinalizado.demo.entity.Educacion;
import proyectofinalizado.demo.entity.Skill;

import java.util.List;
import java.util.Optional;

public interface SkillService {

    List<Skill> findAllSkill();

    Skill update(Skill skill);

    Optional<Skill> skillUnica(Long id);
    Skill guardar(Skill skill);
    void eliminar(Long id);
}

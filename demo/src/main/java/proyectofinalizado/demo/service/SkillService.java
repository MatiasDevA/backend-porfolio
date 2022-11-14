package proyectofinalizado.demo.service;

import proyectofinalizado.demo.entity.Educacion;
import proyectofinalizado.demo.entity.Skill;

import java.util.List;
import java.util.Optional;

public interface SkillService {

    public List<Skill> findAllSkill();

    public Skill update(Skill skill);

    Optional<Skill> skillUnica(Long id);
    public Skill guardar(Skill skill);
    public void eliminar(Long id);
}

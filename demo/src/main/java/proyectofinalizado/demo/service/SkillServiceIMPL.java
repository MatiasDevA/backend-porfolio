package proyectofinalizado.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectofinalizado.demo.entity.Educacion;
import proyectofinalizado.demo.entity.Skill;
import proyectofinalizado.demo.repository.EducacionRepository;
import proyectofinalizado.demo.repository.SkillRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SkillServiceIMPL implements SkillService {

    @Autowired
    private SkillRepository skiRepo;

    @Override
    public List<Skill> findAllSkill() {
        return skiRepo.findAll();
    }

    @Override
    public Skill update(Skill skill) {
        return skiRepo.save(skill);
    }

    @Override
    public Optional<Skill> skillUnica(Long id) {
        Optional<Skill> skill = skiRepo.findById(id);
        return skill;
    }

    @Override
    public Skill guardar(Skill skill
    ) {
        return skiRepo.save(skill);
    }

    @Override
    public void eliminar(Long id) {
        skiRepo.deleteById(id);
    }
}

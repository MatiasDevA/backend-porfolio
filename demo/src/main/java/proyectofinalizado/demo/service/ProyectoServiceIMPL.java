package proyectofinalizado.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectofinalizado.demo.entity.Proyecto;
import proyectofinalizado.demo.entity.Skill;
import proyectofinalizado.demo.repository.ProyectoRepository;
import proyectofinalizado.demo.repository.SkillRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProyectoServiceIMPL implements ProyectoService {

    @Autowired
    private ProyectoRepository proRepo;

    @Override
    public List<Proyecto> findAllProyects() {
        return proRepo.findAll();
    }

    @Override
    public Proyecto update(Proyecto proyecto) {
        return proRepo.save(proyecto);
    }

    @Override
    public Optional<Proyecto> proyectoUnico(Long id) {
        Optional<Proyecto> proyecto = proRepo.findById(id);
        return proyecto;
    }

    @Override
    public Proyecto guardar(Proyecto proyecto) {
        return proRepo.save(proyecto);
    }

    @Override
    public void eliminar(Long id) {
        proRepo.deleteById(id);
    }
}

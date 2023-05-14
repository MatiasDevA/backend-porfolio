package proyectofinalizado.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectofinalizado.demo.entity.Experiencia;
import proyectofinalizado.demo.repository.ExperienciaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienciaServiceIMPL implements ExperienciaService{

    @Autowired
    private ExperienciaRepository expRepo;

    @Override
    public List<Experiencia> finAllExperiencia() {
        return expRepo.findAll();
    }

    @Override
    public Experiencia update(Experiencia experiencia) {
        return  expRepo.save(experiencia);
    }

    @Override
    public Optional<Experiencia> experecienciaUnica(Long id) {
        Optional<Experiencia> experiencia = expRepo.findById(id);
        return experiencia;
    }

    @Override
    public Experiencia guardar(Experiencia experiencia) {
        return expRepo.save(experiencia);
    }

    @Override
    public void eliminar(Long id) {
        expRepo.deleteById(id);
    }
}

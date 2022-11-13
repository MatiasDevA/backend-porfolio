package proyectofinalizado.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectofinalizado.demo.entity.Educacion;
import proyectofinalizado.demo.repository.EducacionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EducacionServiceIMPL implements EducacionService {
    @Autowired
    private EducacionRepository eduRepo;

    @Override
    public List<Educacion> findAllEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public Educacion update(Educacion educacion) {
        return eduRepo.save(educacion);
    }

    @Override
    public Optional<Educacion> educacionUnica(Long id) {
        Optional<Educacion> educacion = eduRepo.findById(id);
        if(educacion != null){
            return educacion;
        } else {
            return null;
        }
    }

    @Override
    public Educacion guardar(Educacion educacion) {
        return eduRepo.save(educacion);
    }

    @Override
    public void eliminar(Long id) {
        eduRepo.deleteById(id);
    }
}

package proyectofinalizado.demo.service;

import proyectofinalizado.demo.entity.Experiencia;

import java.util.List;
import java.util.Optional;

public interface ExperienciaService {


    public List<Experiencia> finAllExperiencia();

    public Experiencia update(Experiencia experiencia);

    Optional<Experiencia> experecienciaUnica(Long id);
    public Experiencia guardar(Experiencia experiencia);
    public void eliminar(Long id);
}

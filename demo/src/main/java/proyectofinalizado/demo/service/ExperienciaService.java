package proyectofinalizado.demo.service;

import proyectofinalizado.demo.entity.Experiencia;

import java.util.List;
import java.util.Optional;

public interface ExperienciaService {


    List<Experiencia> finAllExperiencia();

    Experiencia update(Experiencia experiencia);

    Optional<Experiencia> experecienciaUnica(Long id);
    Experiencia guardar(Experiencia experiencia);
    void eliminar(Long id);
}

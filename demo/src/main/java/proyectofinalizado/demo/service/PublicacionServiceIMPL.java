package proyectofinalizado.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectofinalizado.demo.entity.Publicacion;
import proyectofinalizado.demo.repository.PublicacionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PublicacionServiceIMPL implements PublicacionService {

    @Autowired
    PublicacionRepository publicacionRepository;
    @Override
    public List<Publicacion> verPublicaciones() {
        return  publicacionRepository.findAll();
    }

    @Override
    public Publicacion guardar(Publicacion publicacion) {
        return  publicacionRepository.save(publicacion);
    }

    @Override
    public void update(Publicacion publicacion) {
        publicacionRepository.save(publicacion);
    }

    @Override
    public void eliminar(Integer id) {
        publicacionRepository.deleteById(id);
    }

    @Override
    public Optional<Publicacion> publicacionUnica(Integer id) {
        return publicacionRepository.findById(id);
    }
}

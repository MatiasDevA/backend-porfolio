package proyectofinalizado.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectofinalizado.demo.entity.Usuario;
import proyectofinalizado.demo.repository.UsuarioRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UsuarioServiceIMPL  implements  UsuarioService{


    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    @Override
    public boolean existsByNombreUsuario(String nombreUsuario) {
        return usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

    @Override
    public boolean existsByEmail(String email) {
        return usuarioRepository.existsByEmail(email);
    }

    @Override
    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}

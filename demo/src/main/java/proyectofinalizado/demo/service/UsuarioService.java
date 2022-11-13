package proyectofinalizado.demo.service;

import proyectofinalizado.demo.entity.Usuario;

import java.util.Optional;

public interface UsuarioService {

    Optional<Usuario> getByNombreUsuario(String nombreUsuario);


    boolean existsByNombreUsuario(String nombreUsuario);

    boolean existsByEmail(String email);


    public void save(Usuario usuario);
}

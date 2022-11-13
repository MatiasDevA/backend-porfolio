package proyectofinalizado.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyectofinalizado.demo.controller.DTO.Mensaje;
import proyectofinalizado.demo.entity.Comentario;
import proyectofinalizado.demo.entity.Publicacion;
import proyectofinalizado.demo.service.ComentarioService;

import java.util.List;

@RestController
@RequestMapping("/comentario")
@CrossOrigin
public class ComentarioController {

    @Autowired
    ComentarioService comentarioService;


    @GetMapping("/all")
    public List<Comentario> verComentarios(){
        return  comentarioService.verComentarios();

    }


    @PostMapping("/save")
    public void  guardar(@RequestBody Comentario comentario){
        comentarioService.guardar(comentario);

    }

    @GetMapping("/comentario/{publicacionId}")
    public List<Comentario> listarComentariosDeUnaPublicacion(@PathVariable("publicacionId") int publicacionId){
        Publicacion publicacion = new Publicacion();
        publicacion.setId(publicacionId);
        return comentarioService.listarComentariosDeUnaPublicacion(publicacion);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Comentario> update(@PathVariable("id") @RequestBody Comentario comentario){
        comentarioService.guardar(comentario);
        return new ResponseEntity<>(comentario, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        comentarioService.eliminar(id);
        return new ResponseEntity<>(new Mensaje("Eliminado"), HttpStatus.OK);
    }
}

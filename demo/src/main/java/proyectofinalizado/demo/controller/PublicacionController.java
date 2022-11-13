package proyectofinalizado.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyectofinalizado.demo.controller.DTO.Mensaje;
import proyectofinalizado.demo.entity.Publicacion;
import proyectofinalizado.demo.service.PublicacionService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/publicacion")
@CrossOrigin
public class PublicacionController {

    @Autowired
    private PublicacionService publicacionService;

    @GetMapping("/all")
    public List<Publicacion> verPublicacion(){
        return publicacionService.verPublicaciones();
    }

    @PostMapping("/save")
    public Publicacion guardar(@RequestBody Publicacion publicacion){
        return this.publicacionService.guardar(publicacion);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Publicacion> update(@PathVariable("id") Publicacion publicacion){
        publicacionService.guardar(publicacion);
        return new ResponseEntity<Publicacion>(publicacion, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        publicacionService.eliminar(id);
        return new ResponseEntity<>(new Mensaje("Eliminado"), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Optional<Publicacion> getPublicacion(@PathVariable("id") int id){
        return publicacionService.publicacionUnica(id);
    }
}

package proyectofinalizado.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyectofinalizado.demo.entity.Educacion;
import proyectofinalizado.demo.service.EducacionService;

import java.util.List;

@RestController
@RequestMapping("/educacion")
@CrossOrigin
public class EducacionController {
    @Autowired
    private EducacionService eduService;


    @GetMapping("/all")
    public List<Educacion> findAllEducacion(){
        return eduService.findAllEducacion();
    }



    @PostMapping("/save")
    public void  guardar(@RequestBody Educacion educacion){
        eduService.guardar(educacion);
    }


    @PutMapping("/update/{id}")
    public Educacion update(@PathVariable("id") Long id, @RequestBody Educacion educacion){
        Educacion edu = eduService.educacionUnica(id).orElse(null);
        edu.setTitulo(educacion.getTitulo());
        edu.setDescripcion(educacion.getDescripcion());
        eduService.update(edu);
        return edu;

    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        eduService.eliminar(id);
    }

    @GetMapping("/educacion/{id}")
    public Educacion getEducacion(@PathVariable("id") Long id)  {
        return eduService.educacionUnica(id).orElse(null);
    }
}

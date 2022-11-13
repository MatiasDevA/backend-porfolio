package proyectofinalizado.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyectofinalizado.demo.entity.Experiencia;
import proyectofinalizado.demo.service.ExperienciaService;

import java.util.List;

@RestController
@RequestMapping("/experiencia")
@CrossOrigin
public class ExperienciaController {

    @Autowired
    private ExperienciaService expeService;


    @GetMapping("/all")
    public List<Experiencia> finAllExperience(){
        return expeService.finAllExperiencia();
    }



    @PostMapping("/save")
    public void  guardar(@RequestBody Experiencia experiencia){
        expeService.guardar(experiencia);
    }


    @PutMapping("/update/{id}")
    public Experiencia update(@PathVariable("id") Long id, @RequestBody Experiencia experiencia){
        Experiencia exp = expeService.experecienciaUnica(id).orElse(null);
        exp.setTitulo(experiencia.getTitulo());
        exp.setDescripcion(experiencia.getDescripcion());
        expeService.update(exp);
        return exp;

    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        expeService.eliminar(id);
    }

    @GetMapping("/experiencia/{id}")
    public Experiencia getExperiencia(@PathVariable("id") Long id)  {
        return expeService.experecienciaUnica(id).orElse(null);
    }
}

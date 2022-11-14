package proyectofinalizado.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyectofinalizado.demo.entity.Proyecto;
import proyectofinalizado.demo.entity.Skill;
import proyectofinalizado.demo.service.ProyectoService;
import proyectofinalizado.demo.service.SkillService;

import java.util.List;

@RestController
@RequestMapping("/proyecto")
@CrossOrigin
public class ProyectoController {


    @Autowired
    private ProyectoService proServi;


    @GetMapping("/all")
    public List<Proyecto> findAllProyects(){
        return proServi.findAllProyects();
    }



    @PostMapping("/save")
    public void  guardar(@RequestBody Proyecto proyecto){
        proServi.guardar(proyecto);
    }


    @PutMapping("/update/{id}")
    public Proyecto update(@PathVariable("id") Long id, @RequestBody Proyecto proyecto){
        Proyecto pro = proServi.proyectoUnico(id).orElse(null);
        pro.setTitulo(proyecto.getTitulo());
        pro.setDescripcion(proyecto.getDescripcion());
        pro.setImage(proyecto.getImage());
        proServi.update(pro);
        return pro;

    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        proServi.eliminar(id);
    }

    @GetMapping("/proyecto/{id}")
    public Proyecto getProyect(@PathVariable("id") Long id)  {
        return proServi.proyectoUnico(id).orElse(null);
    }
}

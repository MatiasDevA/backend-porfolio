package proyectofinalizado.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyectofinalizado.demo.entity.Experiencia;
import proyectofinalizado.demo.entity.Skill;
import proyectofinalizado.demo.service.ExperienciaService;
import proyectofinalizado.demo.service.SkillService;

import java.util.List;

@RestController
@RequestMapping("/skill")
@CrossOrigin
public class SkillController {


    @Autowired
    private SkillService skiService;


    @GetMapping("/all")
    public List<Skill> findAllSkills(){
        return skiService.findAllSkill();
    }



    @PostMapping("/save")
    public void  guardar(@RequestBody Skill skill){
        skiService.guardar(skill);
    }


    @PutMapping("/update/{id}")
    public Skill update(@PathVariable("id") Long id, @RequestBody Skill skill){
        Skill ski = skiService.skillUnica(id).orElse(null);
        ski.setTitulo(skill.getTitulo());
        ski.setPorcentage(skill.getPorcentage());
        ski.setImage(skill.getImage());
        skiService.update(ski);
        return ski;

    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        skiService.eliminar(id);
    }

    @GetMapping("/skill/{id}")
    public Skill getSkill(@PathVariable("id") Long id)  {
        return skiService.skillUnica(id).orElse(null);
    }
}

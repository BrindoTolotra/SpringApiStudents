package controller;
import model.Groupes;
import model.Students;
import org.springframework.web.bind.annotation.*;
import repository.ImplementationRepository;

import java.util.List;

@RestController
public class ApiController {
    @GetMapping("/groups")
    public List<Groupes> getGroups(){
        return null;
    }
    @GetMapping("/students")
    public List<Students> getstudent(){
        ImplementationRepository result = ImplementationRepository.getInstance();
        return result.findAll();
    }
    @GetMapping("/students/{name}")
    public @ResponseBody List<Students> getStudentsWhere(@PathVariable (required = true) String name){
        ImplementationRepository result = ImplementationRepository.getInstance();
        return result.findWhereNameLike(name);
    }
    @PostMapping("/students")
    public @ResponseBody Students saveStudent(@RequestBody (required = true) String name){
        ImplementationRepository result = ImplementationRepository.getInstance();
        return  result.save(name);
    }
    @DeleteMapping("/students/{id}")
    public @ResponseBody String deleteStudent(@PathVariable (required = true) Long id){
        ImplementationRepository result = ImplementationRepository.getInstance();
        return result.deleteById(id);
    }
}
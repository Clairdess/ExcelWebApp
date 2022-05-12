package clairdess.excelwebapp.controller;

import clairdess.excelwebapp.entity.ResistorEntity;
import clairdess.excelwebapp.exceptions.NotFound;
import clairdess.excelwebapp.model.Resistor;
import clairdess.excelwebapp.repo.ResistorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class MainController {
    //TODO add REST/RESTful api
    private ResistorRepo resistorRepo;

    @Autowired
    public void setResistorRepo(ResistorRepo resistorRepo) {
        this.resistorRepo = resistorRepo;
    }

    @GetMapping("{id}")
    public Resistor getResistor(@PathVariable Long id) {
        if (resistorRepo.getById(id) != null)
            return resistorRepo.getById(id);
        else throw new NotFound();
    }


    @PostMapping
    public ResponseEntity<String> postResistor(@RequestBody Resistor resistor){
        try{
            resistorRepo.save(resistor);
            return ResponseEntity.ok("Resistor is save");
        } catch (Exception e ){
            return ResponseEntity.badRequest().body("Error in isAlive request");
        }

    }
    @GetMapping("/isAlive")
    public ResponseEntity<String> isAlive(){
        try{
            return ResponseEntity.ok("Server is alive");
        } catch (Exception e ){
            return ResponseEntity.badRequest().body("Error in isAlive request");
        }
    }
}

package clairdess.excelwebapp.controller;

import clairdess.excelwebapp.Parser;
import clairdess.excelwebapp.entity.ResistorEntity;
import clairdess.excelwebapp.exceptions.NotFound;
import clairdess.excelwebapp.model.Resistor;
import clairdess.excelwebapp.repo.ResistorRepo;
import clairdess.excelwebapp.service.ResistorService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jsoup.HttpStatusException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.io.IOException;
import java.util.List;

@Setter
@RestController
@RequestMapping("/api")
@NoArgsConstructor
@AllArgsConstructor

public class MainController {
    //TODO add REST/RESTful api

    private ResistorService resistorService;
    @Autowired
    public void ResistorService(ResistorService resistorService) {
        this.resistorService = resistorService;
    }


    @GetMapping("/all")
    /* TODO create method that response for getting all resistors*/
    public RequestEntity<Resistor> getAllResistors(){
        return null;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Resistor> getResistor(@PathVariable Long id) {
        try {
            ResistorEntity resistorEntity = resistorService.getResistorRepo().getById(id);
            if (resistorEntity != null) {
                return ResponseEntity.ok( Resistor.toModel(resistorEntity));
            }
            else throw new NotFound();
        } catch (EntityNotFoundException e){
            return null;
        }
    }

    @GetMapping("/")
    public ResponseEntity<List<Resistor>> getListResistors() throws IOException {
        try {
            return ResponseEntity.ok(Parser.getRandomListResistors());
        }catch (HttpStatusException exception){
            System.out.println(exception);
        }
       return ResponseEntity.noContent().build();
    }



    @PostMapping
    public ResponseEntity<String> postResistor(@RequestBody ResistorEntity resistorEntity){
        try{
            resistorService.getResistorRepo().save(resistorEntity);
            return ResponseEntity.ok("Resistor is save");
        } catch (Exception e ){
            return ResponseEntity.badRequest().body("Error in isAlive request");
        }
    }
    @PostMapping("/all")
    public ResponseEntity<String> postListResistor(@RequestBody List<ResistorEntity> resistorEntity){
        try{
            resistorService.getResistorRepo().saveAll(resistorEntity);
            return ResponseEntity.ok("All resistor maybe is save");
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

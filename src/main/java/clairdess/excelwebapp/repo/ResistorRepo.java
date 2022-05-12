package clairdess.excelwebapp.repo;

import clairdess.excelwebapp.model.Resistor;
import org.springframework.data.repository.CrudRepository;

public interface ResistorRepo extends CrudRepository<Resistor,Long> {
    Resistor getById(Long id);
}

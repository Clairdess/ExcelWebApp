package clairdess.excelwebapp.repo;

import clairdess.excelwebapp.entity.ResistorEntity;
import clairdess.excelwebapp.model.Resistor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResistorRepo extends CrudRepository<ResistorEntity,Long> {
    ResistorEntity getById(Long id);
}

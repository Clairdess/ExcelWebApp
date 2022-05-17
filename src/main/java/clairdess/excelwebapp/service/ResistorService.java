package clairdess.excelwebapp.service;

import clairdess.excelwebapp.entity.ResistorEntity;
import clairdess.excelwebapp.repo.ResistorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResistorService {

    private ResistorRepo resistorRepo;

    @Autowired
    public ResistorService(ResistorRepo resistorRepo) {
        this.resistorRepo = resistorRepo;
    }

    public ResistorRepo getResistorRepo() {
        return resistorRepo;
    }
}

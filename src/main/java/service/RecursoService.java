package service;

import model.Recurso;
import repository.RecursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecursoService {
    @Autowired
    private RecursoRepository recursoRepository;

    public List<Recurso> getAllRecursos() {
        return recursoRepository.findAll();
    }

    public Recurso getRecursoById(Long id) {
        return recursoRepository.findById(id).orElse(null);
    }

    public Recurso addRecurso(Recurso recurso) {
        return recursoRepository.save(recurso);
    }

    public Recurso updateRecurso(Long id, Recurso recurso) {
        recurso.setId(id);
        return recursoRepository.save(recurso);
    }

    public void deleteRecurso(Long id) {
        recursoRepository.deleteById(id);
    }
}

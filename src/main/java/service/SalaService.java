package service;

import model.Sala;
import org.springframework.stereotype.Repository;
import repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Repository
public class SalaService {
    @Autowired
    private SalaRepository salaRepository;

    public List<Sala> getAllSalas() {
        return salaRepository.findAll();
    }

    public Sala getSalaById(Long id) {
        return salaRepository.findById(id).orElse(null);
    }

    public Sala saveSala(Sala sala) {
        return salaRepository.save(sala);
    }

    public void deleteSala(Long id) {
        salaRepository.deleteById(id);

    }

}
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import model.Sala;
import service.SalaService;
import repository.SalaRepository; // Importe o SalaRepository

import java.util.List;

@RestController
@RequestMapping("/api/salas")
public class SalaController {
    @Autowired
    private SalaService salaService;

    @Autowired // Injete o SalaRepository
    private SalaRepository salaRepository;

    @GetMapping
    public ResponseEntity<List<Sala>> getAllSalas() {
        return ResponseEntity.ok(salaService.getAllSalas());
    }

    @DeleteMapping("/{id}") // Especifique o id da sala a ser excluída
    public ResponseEntity<?> deleteSala(@PathVariable Long id) {
        salaService.deleteSala(id); // Use o serviço para excluir a sala
        return ResponseEntity.noContent().build();
    }
}

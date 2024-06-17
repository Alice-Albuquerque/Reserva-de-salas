package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import  service.RecursoService;
import  model.Recurso;

@RestController
@RequestMapping("/recursos")
public class RecursoController {

    @Autowired
    private RecursoService recursoService;

    @GetMapping
    public ResponseEntity<List<Recurso>> getAllRecursos() {
        List<Recurso> recursos = recursoService.getAllRecursos();
        return new ResponseEntity<>(recursos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recurso> getRecursoById(@PathVariable("id") Long id) {
        Recurso recurso = recursoService.getRecursoById(id);
        return new ResponseEntity<>(recurso, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Recurso> addRecurso(@RequestBody Recurso recurso) {
        Recurso novoRecurso = recursoService.addRecurso(recurso);
        return new ResponseEntity<>(novoRecurso, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Recurso> updateRecurso(@PathVariable("id") Long id, @RequestBody Recurso recurso) {
        Recurso updatedRecurso = recursoService.updateRecurso(id, recurso);
        return new ResponseEntity<>(updatedRecurso, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRecurso(@PathVariable("id") Long id) {
        recursoService.deleteRecurso(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

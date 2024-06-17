package controller; // Pacote correto

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import model.Reserva;
import model.Sala;
import service.ReservaService;
import service.SalaService;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {
    @Autowired
    private ReservaService reservaService;

    @Autowired
    private SalaService salaService;

    @PostMapping
    public ResponseEntity<Reserva> createReserva(@RequestBody Reserva reserva) {
        return ResponseEntity.ok(reservaService.saveReserva(reserva));
    }

    @GetMapping("/sala/{salaId}")
    public ResponseEntity<List<Reserva>> getReservasBySala(@PathVariable Long salaId) {
        List<Reserva> reservas = reservaService.getReservasBySala(salaId);
        if (reservas != null && !reservas.isEmpty()) {
            return ResponseEntity.ok(reservas);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}

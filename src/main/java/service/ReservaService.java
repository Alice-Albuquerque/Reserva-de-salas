package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.Reserva;
import model.Sala;
import repository.ReservaRepository;
import java.time.LocalDateTime;
import java.util.List;
import model.Reserva;
import repository.ReservaRepository;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> getAllReservas() {
        return reservaRepository.findAll();
    }

    public Reserva getReservaById(Long id) {
        return reservaRepository.findById(id).orElse(null);
    }

    public List<Reserva> getReservasBySala(Long idSala) {
        return reservaRepository.findBySalaId(idSala);
    }
    public Reserva saveReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public void deleteReserva(Long id) {
        reservaRepository.deleteById(id);
    }
}

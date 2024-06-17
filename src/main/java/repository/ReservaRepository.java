package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Reserva;
import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    List<Reserva> findBySalaId(Long idSala);
}

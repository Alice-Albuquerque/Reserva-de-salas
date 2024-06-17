package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.Sala;

public interface SalaRepository extends JpaRepository<Sala, Long> {
}
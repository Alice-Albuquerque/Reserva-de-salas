package model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private long id;
    private long idUsuario;
    private long idSala;
    private LocalDate dataReserva;
    private LocalTime horaReserva;

    public Reserva(long id, long idUsuario, long idSala, LocalDate dataReserva, LocalTime horaReserva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idSala = idSala;
        this.dataReserva = dataReserva;
        this.horaReserva = horaReserva;
    }

    // Getters e setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public long getIdSala() {
        return idSala;
    }

    public void setIdSala(long idSala) {
        this.idSala = idSala;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public LocalTime getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(LocalTime horaReserva) {
        this.horaReserva = horaReserva;
    }
}

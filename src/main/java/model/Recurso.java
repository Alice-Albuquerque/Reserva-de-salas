package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Recurso {
    @Id
    private Long id;
    private String nomeRecurso;

    // Getters e Setters

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeRecurso() {
        return nomeRecurso;
    }

    public void setNomeRecurso(String nomeRecurso) {
        this.nomeRecurso = nomeRecurso;
    }
}

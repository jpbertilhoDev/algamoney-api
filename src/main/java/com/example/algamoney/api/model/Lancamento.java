package com.example.algamoney.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "lancamento")
public class Lancamento {

    @Id
    private Long  id;
    private String descricao;
    private LocalDate dataVencimento;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

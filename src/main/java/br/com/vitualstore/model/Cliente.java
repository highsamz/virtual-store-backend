package br.com.vitualstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

import java.time.LocalDate;

@Entity
@Getter
@Table(name = "cliente")
public class Cliente extends Pessoa{

    private String nome;
    private String cpf;
    private LocalDate dtAniversario;
}

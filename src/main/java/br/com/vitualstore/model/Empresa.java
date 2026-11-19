package br.com.vitualstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(name = "empresa")
public class Empresa extends Pessoa{

    private String cnpj;
    private String razaoSocial;
    private String incricao;
}

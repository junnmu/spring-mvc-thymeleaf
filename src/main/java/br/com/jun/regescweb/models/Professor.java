package br.com.jun.regescweb.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private BigDecimal salario;
    @Enumerated(EnumType.STRING)
    private StatusProfessor statusProfessor;

    public Professor() {

    }

    public Professor(String name, BigDecimal salario, StatusProfessor statusProfessor) {
        this.name = name;
        this.salario = salario;
        this.statusProfessor = statusProfessor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public StatusProfessor getStatusProfessor() {
        return statusProfessor;
    }

    public void setStatusProfessor(StatusProfessor statusProfessor) {
        this.statusProfessor = statusProfessor;
    }
}

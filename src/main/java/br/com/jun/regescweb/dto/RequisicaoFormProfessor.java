package br.com.jun.regescweb.dto;

import br.com.jun.regescweb.models.Professor;
import br.com.jun.regescweb.models.StatusProfessor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class RequisicaoFormProfessor {
    @NotBlank
    @NotNull
    private String name;
    @NotNull
    @DecimalMin("0.0")
    private BigDecimal salario;
    private StatusProfessor statusProfessor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusProfessor getStatusProfessor() {
        return statusProfessor;
    }

    public void setStatusProfessor(StatusProfessor statusProfessor) {
        this.statusProfessor = statusProfessor;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Professor toProfessor() {
        Professor professor = new Professor();
        professor.setName(this.name);
        professor.setSalario(this.salario);
        professor.setStatusProfessor(this.statusProfessor);

        return professor;
    }

    public Professor toProfessor(Professor professor) {
        professor.setName(this.name);
        professor.setSalario(this.salario);
        professor.setStatusProfessor(this.statusProfessor);
        return professor;
    }

    public void fromProfessor(Professor professor) {
        this.name = professor.getName();
        this.salario = professor.getSalario();
        this.statusProfessor = professor.getStatusProfessor();
    }

    @Override
    public String toString() {
        return "RequisicaoNovoProfessor{" +
                "name='" + name + '\'' +
                ", salario=" + salario +
                ", statusProfessor=" + statusProfessor +
                '}';
    }
}

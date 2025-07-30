package net.codejava.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class CalculoIMC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Paciente paciente;

    private double peso;
    private double imc;
    private LocalDateTime fecha;

    public CalculoIMC() {
        this.fecha = LocalDateTime.now();
    }

    public CalculoIMC(Paciente paciente, double peso, double imc) {
        this.paciente = paciente;
        this.peso = peso;
        this.imc = imc;
        this.fecha = LocalDateTime.now();
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "CalculoIMC{" +
                "id=" + id +
                ", paciente=" + paciente +
                ", peso=" + peso +
                ", imc=" + imc +
                ", fecha=" + fecha +
                '}';
    }
}
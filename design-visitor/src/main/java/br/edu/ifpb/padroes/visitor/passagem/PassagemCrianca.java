package br.edu.ifpb.padroes.visitor.passagem;

import br.edu.ifpb.padroes.visitor.Visitante;

import java.time.LocalDate;

public class PassagemCrianca implements Passagem {

    private double distancia;
    private LocalDate dataNascimento;

    public PassagemCrianca(double distancia, LocalDate dataNascimento) {
        this.distancia = distancia;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public double aceitar(Visitante visitante) {
        return visitante.visitar(this);
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getDistancia() {
        return distancia;
    }
}

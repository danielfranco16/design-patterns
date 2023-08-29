package br.edu.ifpb.padroes.visitor.passagem;

import br.edu.ifpb.padroes.visitor.Visitante;

public class PassagemComum implements Passagem {

    private double distancia;

    public PassagemComum(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public double aceitar(Visitante visitante) {
        return visitante.visitar(this);
    }

    public double getDistancia() {
        return distancia;
    }
}

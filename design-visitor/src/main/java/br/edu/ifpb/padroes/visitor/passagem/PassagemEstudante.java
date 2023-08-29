package br.edu.ifpb.padroes.visitor.passagem;

import br.edu.ifpb.padroes.visitor.Visitante;

public class PassagemEstudante implements Passagem {

    public enum RedeEnsino {
        MUNICIPAL, ESTADUAL, FEDERAL
    }

    private double distancia;
    private RedeEnsino redeEnsino;

    public PassagemEstudante(double distancia, RedeEnsino redeEnsino) {
        this.distancia = distancia;
        this.redeEnsino = redeEnsino;
    }

    @Override
    public double aceitar(Visitante visitante) {
        return visitante.visitar(this);
    }

    public RedeEnsino getRedeEnsino() {
        return redeEnsino;
    }

    public double getDistancia() {
        return distancia;
    }
}

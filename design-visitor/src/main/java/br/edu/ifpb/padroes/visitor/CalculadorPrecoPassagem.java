package br.edu.ifpb.padroes.visitor;

import br.edu.ifpb.padroes.visitor.passagem.Passagem;

public class CalculadorPrecoPassagem {

    private Visitante visitante;

    public CalculadorPrecoPassagem(Visitante visitante) {
        this.visitante = visitante;
    }

    public void setVisitor(Visitante visitante) {
        this.visitante = visitante;
    }

    public double calcularValorPassagem(Passagem passagem) {
        return passagem.aceitar(visitante);
    }
}

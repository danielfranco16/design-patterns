package br.edu.ifpb.padroes.visitor;

import br.edu.ifpb.padroes.visitor.passagem.PassagemComum;
import br.edu.ifpb.padroes.visitor.passagem.PassagemCrianca;
import br.edu.ifpb.padroes.visitor.passagem.PassagemEstudante;
import br.edu.ifpb.padroes.visitor.passagem.PassagemIdoso;

import java.time.LocalDate;

public class VisitanteRegraPassagem2023 implements Visitante {

    private double valorPorKm;

    public VisitanteRegraPassagem2023(double valorPorKm) {
        this.valorPorKm = valorPorKm;
    }

    @Override
    public double visitar(PassagemComum passagem) {
        return passagem.getDistancia() * valorPorKm;
    }

    @Override
    public double visitar(PassagemEstudante passagem) {
        double desconto = 0;
        switch (passagem.getRedeEnsino()) {
            case MUNICIPAL -> desconto = 0.30;
            case ESTADUAL -> desconto = 0.25;
            case FEDERAL -> desconto = 0.35;
        }
        return (passagem.getDistancia() * valorPorKm) * (1d - desconto);
    }

    @Override
    public double visitar(PassagemCrianca passagem) {
        LocalDate dataGratuidade = LocalDate.now().minusYears(10);
        if (passagem.getDataNascimento().isAfter(dataGratuidade)) {
            LocalDate dataMeia = LocalDate.now().minusYears(5);
            if (passagem.getDataNascimento().isBefore(dataMeia)) {
                return (passagem.getDistancia() * valorPorKm) / 2;
            } return 0; // Gratuidade
        }
        return (passagem.getDistancia() * valorPorKm);
    }

    @Override
    public double visitar(PassagemIdoso passagem) {
        LocalDate dataMeia = LocalDate.now().minusYears(60);
        if (passagem.getDataNascimento().isBefore(dataMeia)) {
            return (passagem.getDistancia() * valorPorKm) / 2;
        } return (passagem.getDistancia() * valorPorKm);
    }

}

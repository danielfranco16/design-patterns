package br.edu.ifpb.padroes.visitor;

import br.edu.ifpb.padroes.visitor.passagem.*;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Visitante regraPassagem2023 = new VisitanteRegraPassagem2023(0.5);
        CalculadorPrecoPassagem calculadorPrecoPassagem = new CalculadorPrecoPassagem(regraPassagem2023);

        Passagem passagemEstudante = new PassagemEstudante(100, PassagemEstudante.RedeEnsino.ESTADUAL);
        Passagem passagemCrianca = new PassagemCrianca(100, LocalDate.of(2020, 02, 02));
        Passagem passagemIdoso = new PassagemIdoso(100, LocalDate.of(1950, 02, 02));
        Passagem passagemComum = new PassagemComum(100);

        System.out.println("O valor da passagem comum é: " + calculadorPrecoPassagem.calcularValorPassagem(passagemComum));
        System.out.println("O valor da passagem estudante é: " + calculadorPrecoPassagem.calcularValorPassagem(passagemEstudante));
        System.out.println("O valor da passagem criança é: " + calculadorPrecoPassagem.calcularValorPassagem(passagemCrianca));
        System.out.println("O valor da passagem idoso é: " + calculadorPrecoPassagem.calcularValorPassagem(passagemIdoso));
    }

}

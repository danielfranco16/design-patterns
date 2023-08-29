package br.edu.ifpb.padroes.visitor;

import br.edu.ifpb.padroes.visitor.passagem.PassagemComum;
import br.edu.ifpb.padroes.visitor.passagem.PassagemCrianca;
import br.edu.ifpb.padroes.visitor.passagem.PassagemEstudante;
import br.edu.ifpb.padroes.visitor.passagem.PassagemIdoso;

public interface Visitante {

    double visitar(PassagemComum passagem);
    double visitar(PassagemEstudante passagem);
    double visitar(PassagemCrianca passagem);
    double visitar(PassagemIdoso passagem);

}

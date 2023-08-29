public class CalculadorPrecoIngresso {

    private Visitor visitante;

    public CalculadorPrecoIngresso(Visitor visitante) {
        this.visitante = visitante;
    }

    public void setVisitor(Visitor visitante) {
        this.visitante = visitante;
    }

    public double calcularValorPassagem(Ingresso passagem) {
        return passagem.aceitar(visitante);
    }
}

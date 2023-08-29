public class IngressoEstudante implements Ingresso {

    public enum RedeEnsino {
        MUNICIPAL, ESTADUAL, FEDERAL
    }

    private double distancia;
    private RedeEnsino redeEnsino;

    public IngressoEstudante(double distancia, RedeEnsino redeEnsino) {
        this.distancia = distancia;
        this.redeEnsino = redeEnsino;
    }

    @Override
    public double aceitar(Visitor visitante) {
        return visitante.visitar(this);
    }

    public RedeEnsino getRedeEnsino() {
        return redeEnsino;
    }

    public double getDistancia() {
        return distancia;
    }
}

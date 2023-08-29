public class IngressoComum implements Ingresso {

    private double valorIngressoComun;

    public IngressoComum(double valorIngressoComun) {
        this.valorIngressoComun = valorIngressoComun;
    }

    @Override
    public double aceitar(Visitor visitante) {
        return visitante.visitar(this);
    }

    public double getDistancia() {
        return valorIngressoComun;
    }
}

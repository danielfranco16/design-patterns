import java.time.LocalDate;

public class VisitorIngresso implements Visitor {

    private double valorPorEntrada;

    public VisitorIngresso(double valorIngressoComun) {
        this.valorPorEntrada = valorIngressoComun;
    }

    @Override
    public double visitar(IngressoComum valorIngressoComun) {
        return  valorPorEntrada;
    }

    @Override
    public double visitar(IngressoEstudante valorIngressoComun) {
        double desconto = 0;
        switch (valorIngressoComun.getRedeEnsino()) {
            case MUNICIPAL -> desconto = 0.30;
            case ESTADUAL -> desconto = 0.25;
            case FEDERAL -> desconto = 0.35;
        }
        return (valorPorEntrada ) * (1d - desconto);
    }


    @Override
    public double visitar(IngressoIdoso valorIngressoComun) {
        LocalDate dataMeia = LocalDate.now().minusYears(60);
        if (valorIngressoComun.getDataNascimento().isBefore(dataMeia)) {
            return (valorPorEntrada) / 2;
        } return (valorPorEntrada);
    }

}

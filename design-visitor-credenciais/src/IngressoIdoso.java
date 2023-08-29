
import java.time.LocalDate;

public class IngressoIdoso implements Ingresso {

    private double valorIngressoComun;
    private LocalDate dataNascimento;

    public IngressoIdoso(double valorIngressoComun, LocalDate dataNascimento) {
        this.valorIngressoComun = valorIngressoComun;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public double aceitar(Visitor visitante) {
        return visitante.visitar(this);
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getDistancia() {
        return valorIngressoComun;
    }
}

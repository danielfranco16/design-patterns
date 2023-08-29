public interface Visitor {

    double visitar(IngressoComum valorIngressoComun);
    double visitar(IngressoEstudante valorIngressoComun);
    double visitar(IngressoIdoso valorIngressoComun);

}

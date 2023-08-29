import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
       
        Visitor regraIngresso = new VisitorIngresso(50);
        CalculadorPrecoIngresso calculadorPrecoIngresso = new CalculadorPrecoIngresso(regraIngresso);

        Ingresso ingressoEstudante = new IngressoEstudante(100, IngressoEstudante.RedeEnsino.ESTADUAL);
        Ingresso ingressoIdoso = new IngressoIdoso(100, LocalDate.of(1950, 02, 02));
        Ingresso ingressoComum = new IngressoComum(100);

        System.out.println("O valor do ingresso comum é: " + calculadorPrecoIngresso.calcularValorPassagem(ingressoComum));
        System.out.println("O valor do ingresso de estudante é: " + calculadorPrecoIngresso.calcularValorPassagem(ingressoEstudante));
        System.out.println("O valor do ingresso de idoso é: " + calculadorPrecoIngresso.calcularValorPassagem(ingressoIdoso));
   
    }

}

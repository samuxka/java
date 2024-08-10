package EstruturaCondicionais;

public class Exercicio1 {
    // €0 €34,712 9.70%
    // €34,713 €68,507 37.35%
    // €68,508 49.50%
    public static void main(String[] args) {
        double salarioAnual = 10000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if(salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixa;
            // System.out.println("\nVocê vai pagar "+valorImposto+"euros de imposto");
        }else if(salarioAnual >= 34713 && salarioAnual <= 68507){
            valorImposto = salarioAnual * segundaFaixa;
            // System.out.println("\nVocê vai pagar "+valorImposto+"euros de imposto");
        }else{
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println("\nVocê vai pagar "+valorImposto+" euros de imposto");
    }
}

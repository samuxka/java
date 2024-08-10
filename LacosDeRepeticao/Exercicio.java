package LacosDeRepeticao;

public class Exercicio {
    public static void main(String[] args) {
        //Imprimir numeros primos 
        for(int numPrimo=2;numPrimo<=1000000;numPrimo++){
            boolean ehPrimo = true;
            for(int i=2;i<=Math.sqrt(numPrimo);i++){
                if(numPrimo%i==0){
                    ehPrimo = false;
                    break;
                }
            }
            if(ehPrimo){
                System.out.println(numPrimo+" É um numero primo");
            }
        }
    }
}

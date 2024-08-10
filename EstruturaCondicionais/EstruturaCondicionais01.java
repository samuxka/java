package EstruturaCondicionais;

public class EstruturaCondicionais01 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if(isAutorizadoComprarBebida != false){
            System.out.println("Pode comprar bebida");
        }else{
            System.out.println("Não Pode comprar bebida");
        }
    }
}

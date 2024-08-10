package LacosDeRepeticao;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        // While, do while, for
        int count = 1;
        while(count < 10){
            System.out.println(++count);
        }
        count = 0;
        do{
            count++;
            System.out.println("Dentro do do-while "+count);
        }while(count < 10);

        count = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("for "+i);
        };
    }
}

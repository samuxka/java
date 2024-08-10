package Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        // Byte, Short, Int, Long, Float e Double = 0
        // Char '\u0000' ' '
        // String null

        String[] nomes = new String[3];
        nomes[0] = "Hifumi";
        nomes[1] = "Ono";
        nomes[2] = "Murayama";

        for(int i=0;i<nomes.length;i++){
            System.out.println(nomes[i]);
        }
    }    
}

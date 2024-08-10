package EstruturaCondicionais;

public class Switch {
    public static void main(String[] args) {
        byte dia = 9;
        switch (dia) {
            case 1:
                System.out.println("\nDomindo");
                break;
            case 2:
                System.out.println("\nSegunda");
                break;
            case 3:
                System.out.println("\nTerça - Feira");
                break;
            case 4:
                System.out.println("\nQuarta - Feira");
                break;
            case 5:
                System.out.println("\nQuinta - Feira");
                break;
            case 6:
                System.out.println("\nSexta - Feira");
                break;
            case 7:
                System.out.println("\nSabado");
                break;
            default:
                System.out.println("\nOpção Invalida");
                break;
        }
    }
}

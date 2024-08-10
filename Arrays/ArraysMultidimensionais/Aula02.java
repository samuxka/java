package Arrays.ArraysMultidimensionais;

public class Aula02 {
    public static void main(String[] args) {
        int[][] arrInt = new int[3][];

        arrInt[0] = new int[]{1,2,3};
        arrInt[1] = new int[]{4,5,6,7,8};
        arrInt[2] = new int[]{9,10,11,12,13,14,15};
        
        for(int[] arrBase: arrInt){
            System.out.println("----------");
            for(int num: arrBase){
                System.out.println(num+" ");
            }
        }

        int[][] arrInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

        for (int[] arrBase2: arrInt2){
            System.out.println("----------");
            for(int num: arrBase2){
                System.out.println(num+" ");
            }
        }
    }
}

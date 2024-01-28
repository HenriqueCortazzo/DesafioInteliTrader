import java.util.Random;

public class Resolution {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = random.nextInt(20) + 1;;
            array2[i] = random.nextInt(48) + 2;
        }
        for (int s: array1){
            System.out.print(s+" ");
        }
        System.out.println();
        for (int s: array2){
            System.out.print(s+" ");
        }

    }
}

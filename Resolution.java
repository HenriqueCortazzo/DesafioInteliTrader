import java.util.Random;

public class Resolution {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] menorValorCadaArray = new int[10];
        int menor = 100;
        int menorMenores = 100;
        int [] distancia = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = random.nextInt(10) + 1;;
            array2[i] = random.nextInt(20) + 5;
        }
        for (int s: array1){
            System.out.print(s+" ");
        }
        System.out.println();
        for (int s: array2){
            System.out.print(s+" ");
        }

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                distancia[j] = array2[i] - array1[j];
                if (menor>distancia[j]){
                    menor = distancia[j];
                }
                menorValorCadaArray[i] = menor;
                if (menorMenores>menorValorCadaArray[i]){
                    menorMenores = menorValorCadaArray[i];
                }
            }
        }
        System.out.println();
        System.out.println(menorMenores);

    }
}

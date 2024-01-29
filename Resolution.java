import java.util.Random;

public class Resolution {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int menor = Integer.MAX_VALUE;
        int[] menorValorCadaArray = new int[10];
        int menorMenores = Integer.MAX_VALUE;
        int valor1 = 0,valor2 = 0;
        int [] distancia = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = random.nextInt(10);
            array2[i] = random.nextInt(40) + 10;
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
                distancia[j] = Math.abs(array1[i] - array2[j]);
                if (menor>distancia[j]){
                    menor = distancia[j];
                    valor1 = array1[i];
                    valor2 =array2[j];
                }
                menorValorCadaArray[i] = menor;
                if (menorMenores>menorValorCadaArray[i]){
                    menorMenores = menorValorCadaArray[i];
                }
            }
        }
        System.out.println();
        System.out.printf("A menor distância é %d entre %d e %d",menorMenores,valor2,valor1);
    }
}

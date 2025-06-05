public class Util {

    public static void bubbleSort() {
        int[] vetor = {3, 4, 9, 2, 5, 8, 2, 1, 7};

        for (int i = 0; i < vetor.length - 1; i++) {
            boolean trocou = false;
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    trocou = true;
                }
            }
            System.out.print("Passo " + (i + 1) + ": ");
            imprimirVetor(vetor);
            if (!trocou) break;
        }
    }
    public static void imprimirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

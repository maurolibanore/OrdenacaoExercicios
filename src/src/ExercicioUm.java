public class ExercicioUm {

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
    public static void selectionSort() {
        int[] vetor = {3, 4, 9, 2, 5, 8, 2, 1, 7};

        for (int i = 0; i < vetor.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            int aux = vetor[i];
            vetor[i] = vetor[minIndex];
            vetor[minIndex] = aux;

            System.out.print("Passo " + (i + 1) + ": ");
            imprimirVetor(vetor);
        }
    }
    public static void insertionSort() {
        int[] vetor = {3, 4, 9, 2, 5, 8, 2, 1, 7};

        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;

            System.out.print("Passo " + i + ": ");
            imprimirVetor(vetor);
        }
    }
    public static void mergeSortComPassos() {
        int[] vetor = {3, 4, 9, 2, 5, 8, 2, 1, 7};
        mergeSort(vetor, 0, vetor.length - 1);
    }

    public static void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);

            System.out.print("Passo: ");
            imprimirVetor(vetor);
        }
    }

    public static void merge(int[] vetor, int inicio, int meio, int fim) {
        int[] temp = new int[fim - inicio + 1];
        int i = inicio, j = meio + 1, k = 0;

        while (i <= meio && j <= fim) {
            if (vetor[i] <= vetor[j]) {
                temp[k++] = vetor[i++];
            } else {
                temp[k++] = vetor[j++];
            }
        }

        while (i <= meio) {
            temp[k++] = vetor[i++];
        }

        while (j <= fim) {
            temp[k++] = vetor[j++];
        }

        for (i = inicio, k = 0; i <= fim; i++, k++) {
            vetor[i] = temp[k];
        }
    }

    public static void imprimirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

public class Decrescente {

    public static void ordDecrescente() {
        int[] vetor = {3, 0, -2, 5, 8};

        for (int i = 0; i < vetor.length; i++) {
            boolean trocou = false;
            for (int j = 0; j < (vetor.length - 1); j++) {
                if (vetor[j] < vetor[j + 1]) {      // so trocar o sinal para menor para fazer decrescente
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    trocou = true;
                }
            }
            if (!trocou) {
                break;

            }
        }
        for (int x = 0; x < vetor.length; x++) {
            System.out.print(vetor[x] + " ");
        }
    }
}

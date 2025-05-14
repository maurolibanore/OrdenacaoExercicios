import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        ordenacaoDecrescente();
//        System.out.println("");
//        ordencacaoParcial();
//        ordenacaoMatriz();
//        classificacaoNotas();
        ExercicioUm ex1 = new ExercicioUm();
//        ex1.insertionSort();
//        ex1.bubbleSort();
//        ex1.selectionSort();
//        ex1.mergeSortComPassos();
//        ordenacaoPontuacoes();


    }

    // EX 2
    public static void ordenacaoDecrescente(){
        int[] vetor = {3,0,-2,5,8};

        for(int i = 0; i < vetor.length; i++) {
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
        for(int x = 0; x < vetor.length; x++) {
            System.out.print(vetor[x]+" ");
        }
    }

    // EX 3
    public static void ordenacaoString(){
        String vetor[] = {"bbb", "aaa", "ccc"};
    }

    // EX 4
    public static void ordencacaoParcial(){
        int n = 4;
        int vetor[] = {8, 4, 3, 7, 6, 5, 2};

        for(int i = 0; i < n; i ++){
            boolean trocou = false;
            for(int j = 0; j < n-1; j++){
                if(vetor[j] > vetor[j+1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                    trocou = true;
                }
            }
            if(!trocou){ break;}
        }
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+ " ");
        }
    }

    // EX 5
    public static void ordenacaoMatriz() {
        int[][] matriz = {
                {3, 2, 1},
                {6, 5, 4},
                {9, 8, 7}
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length - 1; j++) {
                boolean trocou = false;
                for (int k = 0; k < matriz[i].length - 1; k++) {
                    if(matriz[i][k] > matriz[i][k+1]){
                        int aux = matriz[i][k];
                        matriz[i][k] = matriz[i][k+1];
                        matriz[i][k+1] = aux;
                        trocou = true;
                    }
                }
                if (!trocou) {
                    break;
                }

            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // nova linha para cada linha da matriz
        }

    }

    // EX 6
    public static void classificacaoNotas(){
        int notas[] = {85, 70, 95, 60, 75, 80};

        for (int i = 0; i < notas.length; i++) {
            boolean trocou = false;
            for (int j = 0; j < notas.length - 1; j++) {
                if (notas[j] > notas[j+1]){
                    int aux = notas[j];
                    notas[j] = notas[j+1];
                    notas[j+1] = aux;
                    trocou = true;
                }
            }
            if (!trocou) {
                break;
            }
        }
        for (int i = 0; i < notas.length; i++){
            System.out.print(notas[i] + " ");
        }
        System.out.println();

        double mediana = 0;
        int meio = notas.length / 2;

        if(notas.length %2 == 0){
            mediana = (notas[meio -1] + notas[meio]) / 2.;
        }
        else{
            mediana = notas[meio];
        }
        System.out.println("Mediana: " + mediana);
    }

    // EX 7
    public static void ordenacaoPontuacoes() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite as pontuações (ex: 250 300 150 400 350):");
            String[] input = scanner.nextLine().split(" ");     // separa em array de strings pelos espacos
            int[] pontuacoes = new int[input.length];     // conta os numeros

            for (int i = 0; i < input.length; i++) {
                pontuacoes[i] = Integer.parseInt(input[i]);      // recebe como inteiro
            }

            for (int i = 0; i < pontuacoes.length - 1; i++) {
                for (int j = 0; j < pontuacoes.length - 1 - i; j++) {
                    if (pontuacoes[j] < pontuacoes[j + 1]) {
                        int temp = pontuacoes[j];
                        pontuacoes[j] = pontuacoes[j + 1];
                        pontuacoes[j + 1] = temp;
                    }
                }
            }

            System.out.print("Pontuações Ordenadas: [");
            for (int i = 0; i < pontuacoes.length; i++) {
                System.out.print(pontuacoes[i]);
                if (i < pontuacoes.length - 1) System.out.print(", ");
            }
            System.out.println("]");

            System.out.println("Pontuação Mais Alta: " + pontuacoes[0]);
    }



}




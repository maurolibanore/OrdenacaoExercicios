import java.util.Scanner;

public class Pontuacoes {
    public static void ordPont(){
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

public class Matriz {
    public static void ordMatriz(){
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
}

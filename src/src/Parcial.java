public class Parcial {

    public static void ordParcial(){

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
}

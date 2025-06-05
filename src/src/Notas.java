public class Notas {

    public static void ordNotas(){
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
}

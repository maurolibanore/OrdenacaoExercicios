public class StringOrd {

    public static void ordString() {
        String[] vetor = {"bbb", "aaa", "ccc"};

        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j].compareTo(vetor[j + 1]) > 0) {
                    String temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.print("Saída: [");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("\"" + vetor[i] + "\"");
            if (i < vetor.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

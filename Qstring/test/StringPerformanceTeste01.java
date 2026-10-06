package AulasJava.AulasJava.JavaCore.Qstring.test;

public class StringPerformanceTeste01 {
    public static void main(String[] args) {
//        long inicio = System.currentTimeMillis();
//        concatString(30000);
//        long fim = System.currentTimeMillis();
//        System.out.println("Tempo gasto "+ (fim - inicio) + "ms");

        long inicio = System.currentTimeMillis();
        //concatStringBuider(10000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto "+ (fim - inicio) + "ms");

//       // long inicio = System.currentTimeMillis();
//        //concatStringBuider(10000);
//        long fim = System.currentTimeMillis();
//        System.out.println("Tempo gasto "+ (fim - inicio) + "ms");
    }
    private static void concatString(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
            System.out.println(sb);

        }

    }
}

public class ex7 {
    public static void main(String[] args) {
        // Define o número de termos da sequência de Fibonacci a serem calculados
        int n = 10; // Número de termos da sequência que se deseja calcular
        
        // Vetor para armazenar os termos da sequência de Fibonacci
        int[] fibonacciSequence = new int[n];

        // Calcula os primeiros dois termos da sequência de Fibonacci manualmente
        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;
        
        // Calcula os termos restantes da sequência de Fibonacci usando a relação de recorrência
        for (int i = 2; i < n; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }

        // Apresenta a sequência calculada
        System.out.println("Sequência de Fibonacci com " + n + " números:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSequence[i] + " ");
        }
    }
}

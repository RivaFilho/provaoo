package prova;

public class ex9 {
    public static void main(String[] args) {
        
        // Define o limite superior para encontrar os números primos
        int limite = 20; 
        
        // Cria um array booleano para marcar os números primos, onde o índice representa o número e o valor indica se é primo ou não
        boolean[] primos = new boolean[limite + 1];
        
        // Inicializa todos os elementos do array como verdadeiros, assumindo que todos os números são primos inicialmente
        for (int i = 0; i < primos.length; i++) {
            primos[i] = true;
        }
        
        // Define 0 e 1 como não primos
        primos[0] = false; 
        primos[1] = false; 
        
        /**
         * Crivo de Eratóstenes
         */
        // Percorre o array primos até a raiz quadrada do limite
        for (int i=2; i*i < limite; i++) {
            // Verifica se o número atual é primo
            if (primos[i]) {
                // Marca todos os múltiplos do número atual como não primos
                for (int j = i * i; j<=limite; j+=i) {
                    primos[j] = false;
                }
            }
        }
        
        // Exibe os números primos encontrados
        for (int i = 0; i < primos.length; i++) {
            System.out.println(i + ": " + (primos[i] ? "primo" : "ñ-primo"));
        }
    }
}

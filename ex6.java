import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que informe um número decimal
        System.out.print("Informe um número decimal: ");
        
        // Lê o número decimal fornecido pelo usuário
        int numeroDecimal = scanner.nextInt();
        
        // Fecha o Scanner após a leitura
        scanner.close();

        // Converte o número decimal para binário chamando a função converterParaBinario
        String binario = converterParaBinario(numeroDecimal);
        
        // Exibe o resultado da conversão
        System.out.println("O número " + numeroDecimal + " em binário é: " + binario);
    }

    // Função que converte um número decimal para binário
    public static String converterParaBinario(int decimal) {
        // Se o número decimal fornecido for zero, retorna diretamente "0"
        if (decimal == 0) {
            return "0";
        }
        
        // Cria um StringBuilder para construir a representação binária do número
        StringBuilder binario = new StringBuilder();
        
        // Itera enquanto o número decimal for maior que zero
        while (decimal > 0) {
            // Calcula o resto da divisão do número decimal por 2, que será o dígito binário atual
            int resto = decimal % 2;
            
            // Insere o dígito binário à esquerda do StringBuilder
            binario.insert(0, resto);
            
            // Divide o número decimal por 2 para continuar o processo de conversão
            decimal /= 2;
        }
        
        // Retorna a representação binária como uma string
        return binario.toString();
    }
}

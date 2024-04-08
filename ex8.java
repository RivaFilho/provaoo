public class ex8 {
    public static void main(String[] args) {
        // Define um vetor de inteiros inicial
        int[] vetor = new int[] {9, 3, 6, 4, 5, 8, 0, 2, 7, 1};
        
        // Imprime o vetor inicial
        System.out.println(imprimirVetor(vetor));
        
        // Chama a função foo para rotacionar o vetor 3 posições à direita
        int[] resposta = foo(vetor, 3); //"rotacionar 3 casas
        // Imprime o vetor após a rotação
        System.out.println(imprimirVetor(resposta));
    }

    // Função que rotaciona um vetor à direita por k posições
    static int[] foo(int[] vetor, int k) {
        // Cria um novo vetor com o mesmo tamanho do vetor original
        int[] novo = new int[vetor.length];
        // Define um índice j para controlar a posição no novo vetor
        int j = k;
        // Percorre o vetor original
        for (int i=0; i<vetor.length; i++) {
            // Insere o elemento do vetor original na posição correta no novo vetor, considerando a rotação
            novo[j] = vetor[i];
            // Incrementa j e reinicia se exceder o limite do vetor
            j++;
            if (j == vetor.length) {
                j = 0;
            }
        }
        // Retorna o novo vetor rotacionado
        return novo;
    }

    // Função para imprimir um vetor como uma string
    static String imprimirVetor(int[] vetor) {
        String resposta = "[ ";
        // Percorre o vetor
        for (int i=0; i<vetor.length; i++) {
            // Adiciona o elemento atual ao resultado, com vírgula se não for o último elemento
            resposta += vetor[i] + (i < vetor.length - 1 ? ", " : " ]"); 
        }
        // Retorna a representação do vetor em forma de string
        return resposta;
    }
}

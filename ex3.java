package prova;

public class ex3 {
    public static void main (String[] args) {
        int a = 13; 
        int b = 10; 
        int c = 30; 
        
        String resposta1 = ""; 
        String resposta2 = ""; 
        
        resposta1 += a; 
        resposta1 += b; 
        resposta1 += c; //concatenação 131030
        
        resposta2 += a + b + c;//soma igaul 53
        
        System.out.println (resposta1); 
        System.out.println (resposta2); 
     }
}

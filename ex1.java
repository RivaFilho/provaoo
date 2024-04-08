/*package prova;

public class ex1 {
byte: Representa um número inteiro de 8 bits com sinal.
short: Representa um número inteiro de 16 bits com sinal.
int: Representa um número inteiro de 32 bits com sinal.
long: Representa um número inteiro de 64 bits com sinal.
float: Representa um número de ponto flutuante de precisão simples de 32 bits.
double: Representa um número de ponto flutuante de precisão dupla de 64 bits.
char: Representa um caractere Unicode de 16 bits.
boolean: Representa um valor booleano, que pode ser verdadeiro ou falso.
}
import javax.swing.JOptionPane;public class Questao3a { public static void main(String[] args) { String strA = JOptionPane.showInputDialog("Informe o valor de a:"); String strB = JOptionPane.showInputDialog("Informe o valor de b:"); String strC = JOptionPane.showInputDialog("Informe o valor de c:");    float a = Float.parseFloat(strA);
    float b = Float.parseFloat(strB);
    float c = Float.parseFloat(strC);

    String r = "";

    for (int i = (int) a - 1; i >= 0; i--) {
        int x = (int)1+ (i * b);
        System.out.println(x);
        r = x + " " + r;
    }

    System.out.println(r);
}
} vai entrar  5, 2 e3
*/ public class Questao3a { public static void main(String[] args) { int[] x = new int[]{1, 0, 1, 1, 0, 0, 1}; int y = 4; int z = 0; for (int i = x.length; i > 0; i--) { z += calcular(y, Math.abs(i - x.length), x[i - 1]); } System.out.println(z); }static int calcular(int k, int l, int m) {
    int j = 1;
    for (int i = l; i > 0; i--) {
        j *= k;
    }
    j *= m;
    System.out.println(j);
    return j;
}
}

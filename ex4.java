package prova;

import javax.swing.JOptionPane;

public class ex4 {
    public static void main (String[] args) {
    String strA = JOptionPane.showInputDialog("Informe o valor de A"); //leu-se o valor 13.5
    String strB = JOptionPane.showInputDialog("Informe o valor de B"); //leu-se o valor 5
    float a = Float.parseFloat(strA);
    int b = Integer.parseInt(strB); // Corrigido aqui
    
    JOptionPane.showMessageDialog(null, "A + B = " + (int)(a + b));//a soma foi pra int por isso a segunda casa sumiu 18 
    JOptionPane.showMessageDialog(null, "A - B = " + (a - b));// float igual 8,5
}
}

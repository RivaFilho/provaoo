import javax.swing.JOptionPane;

public class ex4 {
    public static void main (String[] args) {
        // Solicita ao usuário o valor de A através de uma caixa de diálogo
        String strA = JOptionPane.showInputDialog("Informe o valor de A"); // leu-se o valor 13.5
        
        // Solicita ao usuário o valor de B através de uma caixa de diálogo
        String strB = JOptionPane.showInputDialog("Informe o valor de B"); // leu-se o valor 5
        
        // Converte a string lida para float (valor de A)
        float a = Float.parseFloat(strA);
        
        // Converte a string lida para int (valor de B)
        int b = Integer.parseInt(strB); // Corrigido aqui
        
        // Exibe a soma de A e B em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "A + B = " + (int)(a + b)); // a soma foi para int por isso a segunda casa sumiu 18 
        
        // Exibe a subtração de A e B em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "A - B = " + (a - b)); // float igual 8,5
    }
}

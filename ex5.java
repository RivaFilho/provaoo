package prova;

import javax.swing.JOptionPane;
/*
a = 1, b = 2, c = 3 nao é triangulo
a = 3, b = 2, c = 4 é um triangulo escaleno 
a = 5, b = 3, c = 4 é um triangulo escaleno e retangulo
a = 3, b = 5, c = 3 é um triangulo isosceles
a = 6, b = 3, c = 3 nao é triangulo
a = 5, b = 5, c = 5 é triangulo equilatero
a = 4, b = 2, c = 4 é um triangulo isosceles
*/
public class ex5 {
	public static void main(String[] args) {
		float a = lerFloat("Informe A:");
		float b = lerFloat("Informe B:");
		float c = lerFloat("Informe C:");
		
		String resposta = "";
		
		if (ehTriangulo(a, b, c)) {
			resposta += "Os lados informados formam um triangulo.\n";
			if (equilatero(a, b, c)) {
				resposta += "É um triangulo equilatero.\n";
			} else if (isosceles(a, b, c)) {
				resposta += "É um triangulo isosceles.\n";
			} else { 
				resposta += "É um triangulo escaleno.\n"; 
			}
			
			if (ehTrianguloRetangulo(a, b, c)) {
				resposta += "É um triangulo retangulo.";
			}
		} else {
			resposta += "Os valores informados não formam um triangulo.";
		}
		
		JOptionPane.showMessageDialog(null, resposta);
	}


	static boolean ehTrianguloRetangulo(float a, float b, float c) {
		boolean resposta = ( (a * a == b * b + c * c) || 
			                 (b * b == a * a + b * c) ||
			                 (c * c == a * a + b * b));
		return resposta;
	}


	static boolean isosceles(float a, float b, float c) {
		boolean resposta = ((a == b && a != c) || 
				            (a == c && a != b) ||
				            (b == c && b != a));
		return resposta;
	}

	static boolean equilatero(float a, float b, float c) {
		boolean resposta = (a == b && a == c);
		return resposta;
	}

	static boolean ehTriangulo(float a, float b, float c) {
		return (( a > Math.abs(b - c) && a < Math.abs(b + c)) && 
				( b > Math.abs(a - c) && b < Math.abs(a + c)) && 
				( c > Math.abs(a - b) && c < Math.abs(a + b)));
	}

	static float lerFloat(String msg) {
		String str = JOptionPane.showInputDialog(msg);
		float f = Float.parseFloat(str);
		return f;
	}

}


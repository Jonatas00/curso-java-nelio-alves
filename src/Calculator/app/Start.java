package Calculator.app;

import javax.swing.JOptionPane;

import Calculator.model.Calculadora;

public class Start {
	public static void main(String[] args) {

		String x = JOptionPane.showInputDialog("Digite o valor de x:");
		String y = JOptionPane.showInputDialog("Digite o valor de y:");

		Calculadora calculadora = new Calculadora(x, y);

		JOptionPane.showMessageDialog(null, "A soma de x+y é " + calculadora.somar());
		JOptionPane.showMessageDialog(null, "A multiplicação de x*y é " + calculadora.multiplicar());
	}
}

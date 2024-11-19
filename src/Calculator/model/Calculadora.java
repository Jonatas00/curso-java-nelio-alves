package Calculator.model;

import javax.swing.JOptionPane;

public class Calculadora {

	public int x;
	public int y;

	public Calculadora(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Calculadora(String x, String y) {
		System.out.println("Tentando fazer a conversão de String para int...");

		try {
			this.x = Integer.parseInt(x);
			this.y = Integer.parseInt(y);

		} catch (NumberFormatException e) {
			JOptionPane.showConfirmDialog(null, "teste", "nao", 0);
			System.exit(0);
		}
	}

	public int somar() {
		return x + y;
	}

	public int multiplicar() {
		return x * y;
	}

}

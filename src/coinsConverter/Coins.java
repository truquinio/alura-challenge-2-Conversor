package coinsConverter;

import javax.swing.JOptionPane;

public class Coins {

	// DE PESO ARG A MONEDAS >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	public void ConvertirPesosADolar(double valorRecibido) {
		double monedaDolar = valorRecibido / 371;

		monedaDolar = (double) Math.round(monedaDolar * 1000000) / 1000000.0; // 6 decimales

		JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = US$" + monedaDolar); // Muestra valor convertido
	}

	public void ConvertirPesosAEuro(double valorRecibido) {
		double monedaEuro = valorRecibido / 397;

		monedaEuro = (double) Math.round(monedaEuro * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = €" + monedaEuro);
	}

	public void ConvertirPesosALibra(double valorRecibido) {
		double monedaDolar = valorRecibido / 240;
		monedaDolar = (double) Math.round(monedaDolar * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = £" + monedaDolar);
	}

	public void ConvertirPesosAYen(double valorRecibido) {
		double monedaDolar = valorRecibido / 1.5;
		monedaDolar = (double) Math.round(monedaDolar * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = ¥" + monedaDolar);
	}

	public void ConvertirPesosAWon(double valorRecibido) {
		double monedaDolar = valorRecibido / 0.15;
		monedaDolar = (double) Math.round(monedaDolar * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = ₩" + monedaDolar);
	}

	// DE MONEDAS A PESO ARG >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	public void ConvertirDolarAPeso(double valorRecibido) {
		double monedaDolar = valorRecibido * 371;
		monedaDolar = (double) Math.round(monedaDolar * 1000000) / 1000000.0; // 2 decimales

		JOptionPane.showMessageDialog(null, "US$" + valorRecibido + " = $" + monedaDolar); // Muestra valor convertido
	}

	public void ConvertirEuroAPeso(double valorRecibido) {
		double monedaEuro = valorRecibido * 397;
		monedaEuro = (double) Math.round(monedaEuro * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, "€" + valorRecibido + " = $" + monedaEuro);
	}

	public void ConvertirLibraAPeso(double valorRecibido) {
		double moneda = valorRecibido * 0.15;
		moneda = (double) Math.round(moneda * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, "£" + valorRecibido + " = $" + moneda);
	}

	public void ConvertirYenAPeso(double valorRecibido) {
		double moneda = valorRecibido * 1.5;
		moneda = (double) Math.round(moneda * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, "¥" + valorRecibido + " = $" + moneda);
	}

	public void ConvertirWonAPeso(double valorRecibido) {
		double moneda = valorRecibido * 3.88;
		moneda = (double) Math.round(moneda * 1000000) / 1000000.0;
		// Muestra valor convertido
		JOptionPane.showMessageDialog(null, "₩" + valorRecibido + " = $" + moneda);
	}
}
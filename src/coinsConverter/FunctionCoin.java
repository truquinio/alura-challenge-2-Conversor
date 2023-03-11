package coinsConverter;

import javax.swing.JOptionPane;

public class FunctionCoin {

	Coins monedas = new Coins();

	public void ConvertirMoneda(double ValorRecibido) {

		String opciones = (JOptionPane.showInputDialog(null, "Seleccione la moneda a convertir", "monedas ",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						"Peso Arg a Dólar", "Peso Arg a Euro", "Peso Arg a Libra esterlina", "Peso Arg a Yen", "Peso Arg a Won",
						"Dólar a Peso Arg", "Euro a Peso Arg", "Libra esterlina a Peso Arg", "Yen a Peso Arg",
						"Won a Peso Arg"
				}, "Selección")).toString();

		switch (opciones) {
			case "Peso Arg a Dólar":
			monedas.ConvertirPesosADolar(ValorRecibido);
				break;
			case "Peso Arg a Euro":
				monedas.ConvertirPesosAEuro(ValorRecibido);
				break;
			case "Peso Arg a Libra esterlina":
				monedas.ConvertirPesosALibra(ValorRecibido);
				break;
			case "Peso Arg a Yen":
				monedas.ConvertirPesosAYen(ValorRecibido);
				break;
			case "Peso Arg a Won":
				monedas.ConvertirPesosAWon(ValorRecibido);
				break;
			case "Dólar a Peso Arg":
				monedas.ConvertirDolarAPeso(ValorRecibido);
				break;
			case "Euro a Peso Arg":
				monedas.ConvertirEuroAPeso(ValorRecibido);
				break;
			case "Libra esterlina a Peso Arg":
				monedas.ConvertirLibraAPeso(ValorRecibido);
				break;
			case "Yen a Peso Arg":
				monedas.ConvertirYenAPeso(ValorRecibido);
				break;
			case "Won a Peso Arg":
				monedas.ConvertirWonAPeso(ValorRecibido);
				break;
			default:
				break;
		}
	}
}
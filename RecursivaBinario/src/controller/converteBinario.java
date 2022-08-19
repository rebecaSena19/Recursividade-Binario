//Feito em conjunto com Isabela Marques

package controller;

public class converteBinario {

	public converteBinario() {

		super();
	}

	public String binario(int num ) {
		// condição de parada
		if (num == 0) {
			return "";

		}
		// função do termo anterior
		int resto = num % 2;
		num = num / 2;
		return binario(num) + resto;
	}

}

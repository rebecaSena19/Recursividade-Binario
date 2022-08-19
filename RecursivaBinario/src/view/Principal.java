
//feito em conjunto com Isabela Marques

package view;

import controller.converteBinario;

public class Principal {

	public static void main(String[] args) {

		converteBinario convert = new converteBinario();

		int num = 13;

		String resto = convert.binario(num);

		System.out.println(resto);
	}
}
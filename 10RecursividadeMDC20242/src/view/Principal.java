package view;

import controller.MaxDC;

public class Principal {

	public static void main(String[] args) {
		MaxDC mdc = new MaxDC();
		int x = 24;
		int y = 20;
		int resultado = mdc.maxDC(x, y);
		System.out.println(resultado);
	}

}

package controller;

public class MaxDC {

	public MaxDC() {
		super();
	}
	
	public int maxDC(int x, int y) {
		//Condi��o de Parada
		if(x == y) {
			return x;
		} else {
			//Chamada de fun��o
			if(x > y) {
				return maxDC((x-y), y);
			} else {
				return maxDC(x, (y-x));
			}
			
		}
	}
}
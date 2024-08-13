package controller;

public class MaxDC {

	public MaxDC() {
		super();
	}
	
	public int maxDC(int x, int y) {
		//Condição de Parada
		if(x == y) {
			return x;
		} else {
			//Chamada de função
			if(x > y) {
				return maxDC((x-y), y);
			} else {
				return maxDC(x, (y-x));
			}
			
		}
	}
}
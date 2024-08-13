package controller;

public class ControllerDivisao {
	public ControllerDivisao () {
		super ();
		
	}
	
	public int Divisao (int divisor, int dividendo) {
		if (dividendo < divisor) {
			return dividendo;
		}
		else {
			return dividendo - Divisao (divisor, dividendo - divisor);
		}
		
	}

}

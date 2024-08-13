package view;
import controller.ControllerDivisao;
public class PrincipalDivisao {
	public static void main (String [] args) {
		
		ControllerDivisao m = new ControllerDivisao();
		int divisor = 3;
		int dividendo = 20;
		int resto = m.Divisao(divisor, dividendo);
		System.out.println ("O resto da divisão de " + dividendo + " por " + divisor + " é " + resto);
	}

}

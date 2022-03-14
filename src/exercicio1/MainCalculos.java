package exercicio1;

public class MainCalculos {
	
	static double x1, x2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Resultado do delta : "+calculaEquacao(2, -10, 8));
		System.out.println("As raizes são respectivamente: "+ x1 +" e "+ x2);
		
	}
	
	public static double calculaEquacao (double a, double b, double c) {
		
		//Calcula delta
		double delta = (Math.pow(b, 2)) -4 * a * c;
		
		//Calcula raízes reais
		calculaRaizes(delta, a, b);
		
		return delta;
		
	}
	
	public static void calculaRaizes (double delta, double a, double b) {
		a = a * 2;
		x1 = (-b + Math.sqrt(delta));
		x1 = x1 / a;      
		x2 = (-b - Math.sqrt(delta));
		x2 = x2 / a;
		
	}

}

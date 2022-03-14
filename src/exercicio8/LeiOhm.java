package exercicio8;

import java.util.Scanner;

public class LeiOhm {
	
	Scanner entrada = new Scanner(System.in);
	double tensao, corrente, resistencia;
	
	
	
	public LeiOhm() {
		super();
	}

	public void calculaResistencia () {
		
		System.out.println("------- Calcular Resist�ncia el�trica -------");
		System.out.print("Informe o valor da Tens�o: ");
		this.tensao = entrada.nextDouble();
		System.out.print("Informe o valor da corrente: ");
		this.corrente = entrada.nextDouble();
		this.resistencia = this.tensao / this.corrente;
		System.out.println("Resit�ncia calculada = "+ this.resistencia);
	}
	
	public void calculaTensao () {
		
		System.out.println("------- Calcular Tens�o el�trica -------");
		System.out.print("Informe o valor da corrente: ");
		this.corrente = entrada.nextDouble();
		System.out.print("Informe o valor da resistencia: ");
		this.resistencia = entrada.nextDouble();
		this.tensao = this.corrente * this.resistencia;
		System.out.println("Tens�o calculada = "+ this.tensao);
	}
	
	public void calculaCorrente () {
		
		System.out.println("------- Calcular Corrente el�trica -------");
		System.out.print("Informe o valor da Tens�o: ");
		this.tensao = entrada.nextDouble();
		System.out.print("Informe o valor da resit�ncia: ");
		this.resistencia= entrada.nextDouble();
		this.corrente = this.tensao / this.resistencia;
		System.out.println("Corrente calculada = "+ this.corrente);
	}
	
}

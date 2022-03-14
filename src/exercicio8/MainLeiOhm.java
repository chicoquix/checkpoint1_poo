package exercicio8;

import java.util.Scanner;

public class MainLeiOhm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		LeiOhm calculadora = new LeiOhm();
		
		String escolha = "";
		int cod;
		
		System.out.println("Bem Vindo a calculadora de Lei de Ohm ");
		System.out.println("");
		do {
			System.out.println("Temos os seguintes calculos...");
			System.out.println("1 - Resistência");
			System.out.println("2 - Tensão");
			System.out.println("3 - Corrente");
			System.out.println("Digite o código do tipo de calculo que deseja realizar: ");
			cod = entrada.nextInt();
				
			switch(cod) {
			case 1:
				calculadora.calculaResistencia();
			break;
			case 2:
				calculadora.calculaTensao();
				break;
			case 3:
				calculadora.calculaCorrente();
				break;
			}
			
			System.out.println("Deseja continuar realizando cálculos? (Sim ou Não)");
			escolha = entrada.next().toUpperCase();
			
		} while (escolha.equals("SIM"));
		
	}

}

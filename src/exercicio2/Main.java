package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		
		String[] nome = new String[3];
		double[] nota1 = new double[3];
		double[] nota2 = new double[3];
		double[] notaNAC = new double[3];
		double[] notaAM = new double[3];
		
		for(int i = 0; i < 3; i++) {
		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("\t Aluno "+(i+1));	
		System.out.println("-------------------------");	
		System.out.println("Digite o nome do aluno : ");
		nome[i] = e.next();
		System.out.println("Digite a nota da 1º prova: ");
		nota1[i] = e.nextDouble();
		System.out.println("Digite a nota da 2º prova: ");
		nota2[i] = e.nextDouble();
		System.out.println("Digite a nota da NAC: ");
		notaNAC[i] = e.nextDouble();
		System.out.println("Digite a nota da AM: ");
		notaAM[i] = e.nextDouble();
		}
		
		Aluno aluno1 = new Aluno(nome[0], nota1[0], nota2[0], notaNAC[0], notaAM[0]);
		Aluno aluno2 = new Aluno(nome[1], nota1[1], nota2[1], notaNAC[1], notaAM[1]);
		Aluno aluno3 = new Aluno(nome[2], nota1[2], nota2[2], notaNAC[2], notaAM[2]);
		
		aluno1.alunoInfo();
		aluno2.alunoInfo();
		aluno3.alunoInfo();
	}

}

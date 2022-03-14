package exercicio2;

public class Aluno {

	String nome;
	double nota1;
	double nota2;
	double notaNAC;
	double notaAM;

	public Aluno(String nome, double nota1, double nota2, double notaNAC, double notaAM) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.notaNAC = notaNAC;
		this.notaAM = notaAM;
	}
	
	


	
	public void alunoInfo () {
		System.out.println("\t Informações do Aluno: "+ this.nome);
		if(verificaSituacao() == true)
		System.out.println("\t Situação - Aprovado!");
		else
		System.out.println("\t Situação - Reprovado!");
		System.out.println("\t Media "+calculaMedia());
		System.out.println("-------------------------------------");
	}
	
	public double calculaMedia() {
		double media = 0;

		media = (this.nota1 + this.nota2 + this.notaAM + this.notaNAC) / 3;

		return media;
	}

	public boolean verificaSituacao() {
		if (calculaMedia() >= 6) {

			return true;
		} else {
			return false;
		}

	}
	
	

}

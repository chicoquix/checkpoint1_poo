package exercicio6;

import java.util.ArrayList;

public class Bolas {

	double raio;
	ArrayList<Bolas> listaBolas = new ArrayList<Bolas>();

	public Bolas(double raio) {
		super();
		this.raio = raio;
	}

	public void dadosBola() {
		System.out.println("----------------------------------");
		System.out.println("---- Dados calculados da bola ----");
		System.out.println("Diâmetro  : \t" + this.raio);
		calculaRaio(this.raio);
		System.out.println("Raio      : \t" + this.raio);
		System.out.println("Volume    : \t" + calcularVolume());
		System.out.println("Perímetro : \t" + calcularPerimetro());
		System.out.println("Área      : \t" + calcularArea());
		System.out.println("----------------------------------");
	}

	public double calculaRaio(double diametro) {

		this.raio = diametro / 2;

		return this.raio;
	}

	public double calcularVolume() {
		double volume = this.raio;

		volume = ((4 / 3) * Math.PI) * Math.pow(raio, 3);

		return volume;

	}

	public double calcularPerimetro() {
		double perimetro = this.raio;

		perimetro = 2 * Math.PI * this.raio;

		return perimetro;
	}

	public double calcularArea() {
		double area = this.raio;

		area = Math.PI * Math.pow(raio, 2);

		return area;
	}

	// método listar bolas
	public ArrayList<Bolas> listarBolas(Bolas bola) {

		this.listaBolas.add(bola);

		
		for (Bolas bolaLista : listaBolas) {
			dadosBola();
		}

		return listaBolas;
	}

}

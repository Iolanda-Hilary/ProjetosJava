package app;

public class Retangulo {
	double altura;
	double largura;

	public double Area() {
		return altura * largura;
	}

	public double Perimetro() {
		return 2 * altura + largura;
	}

	public double Diagonal() {
		return altura * altura + largura * largura;
	}

}

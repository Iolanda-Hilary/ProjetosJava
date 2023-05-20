package exercicio12;

import java.util.Scanner;

public class Funcionario {
	Scanner sc = new Scanner(System.in);
	String nome;
	Double salario;
	Double imposto;

	
public double SalarioBruto() {	
	return salario - imposto;
}
public double AumentoSalario(Double bonus) {
	return SalarioBruto() * bonus / 100;
}
public String toString() {
	return nome + "seu salario atual: " + SalarioBruto();

}

}


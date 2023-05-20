package exercicio12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
		Funcionario fn = new Funcionario();
		Scanner sc = new Scanner(System.in);
		
		
	
		
		 
		
		System.out.println(" Bem Vindo!!");
		System.out.print("Digite seu nome: ");
		String nome = sc.next();
		System.out.println("digite seu imposto anual");
		Double imposto = sc.nextDouble();
		System.out.println("Digite seu salário(sem as taxas)");
		Double salario = sc.nextDouble();
		System.out.println(" seu salario bruto é " + fn.SalarioBruto()) ;

		
		Double bonus = sc.nextDouble();
		
	
	}

}
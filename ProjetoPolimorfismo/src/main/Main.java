package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.FunciTerceirizado;
import entidades.Funcionario;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	

	
	

	System.out.println("Digite quantos funcionarios:");
	int n = sc.nextInt();
	List<Funcionario> lista = new ArrayList<>(n);
	for (int i = 0; i < n; i++) {
		System.out.println("Dados do funcionario Nº" + i);
		System.out.print("Este funcionario é terceirizado? S/N: ");
		String resp = sc.next();
		System.out.print("Nome:");
		String nome = sc.next();
		System.out.print("Horas trabalhadas");
		int horas = sc.nextInt();
		System.out.print("Valor da hora R$");
		double valorHora = sc.nextDouble();
		if (resp == "S") {
			System.out.println("Digite as horas bonus desse funcionario");
				Double horaBonus = sc.nextDouble();
		Funcionario funciterce = new FunciTerceirizado(nome, horas, valorHora, horaBonus);
		lista.add(funciterce);
		 System.out.println("Funcionario Cadastrado!!"); 
		System.out.println("===================================");
		} else { Funcionario funci = new Funcionario(nome, horas, valorHora);
			lista.add(funci);	
			 System.out.println("Funcionario Cadastrado!!"); 
				System.out.println("===================================");
				}
	 
	
		
			
	
	
			
	
	}

}
	}

package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numQuartos = 10;
		int[] vect = new int[numQuartos];
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Bem Vindo ao Hotel EstrelaCadente!");
		System.out.println("Deseja alugar um quarto?  y/n ");
		String resp = sc.next();
		if (resp != "y") {
			String nome, email;
			double tel;
			
			System.out.println("Digite suas informações: ");
			System.out.println("Nome: ");
			nome = sc.next();
			System.out.print("Email: ");
			email = sc.next();
			System.out.println("Telefone: ");
			tel = sc.nextDouble();
			System.out.println("Qual quarto gostaria de ocupar? Temos " + numQuartos + " quartos disponíveis" );
			int quarto = sc.nextInt();
			for (int i = 0; i < numQuartos; i++) { if (quarto == vect[i]) {System.out.println("ksdfj");
				
			}
				
				
			}
		} else {
					
			
			 {
				//if () {
				//System.out.println("Obrigadx volte sempre!");
					
				}
				
				

			}
		}

	

	{

	}

}

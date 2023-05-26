package vetoresProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("digite a quantidade de numeros");
		int n = sc.nextInt();
		int[] vetor = new int[n];

		double numeros[] = new double[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Digite os numeros abaixo: ");
			vetor[i] = sc.nextInt(); 
			}  double maior = vetor[0];
			double posmaior = 0;
			for (int i = 0; i < vetor.length; i++) {
				posmaior = i;}
				System.out.println("maior número é " + maior);
				
			}

		}
	


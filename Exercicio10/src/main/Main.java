package main;

import entities.Aluno;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Digite seu nome: ");
		Scanner sc = new Scanner(System.in);

		

		Aluno alun = new Aluno();
		
		alun.Aluno =  sc.next();
		System.out.println("digite suas tres notas");
		alun.n1 = sc.nextDouble();
		alun.n2 = sc.nextDouble();
		//alun.n3 = sc.nextDouble();
		System.out.println(alun.notaFinal());
		
		if ( alun.notaFinal() <= 7 ) {
			System.out.println("Reprovado :(");
		} else { System.out.println("parabens, boas ferias!!");}
		 sc.close();
	}

}

package main;

import java.util.Scanner;

import entidades.Conta;

public class Main {

	public static void main(String[] args) {
		Conta con;

		Scanner sc = new Scanner(System.in);
		System.out.print("Bem Vindo ao VestBank! Digite seu numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Agora, digite seu nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Gostaria de fazer um deposito inicial? ");
		String resp = sc.next();

		if (resp == "sim") {
			System.out.println("Quanto gostaria de depositar? ");
			int depositoInicial = sc.nextInt();
			con = new Conta(numero, nome, depositoInicial);
			System.out.println(" Saldo atual: " + con.getSaldo());
		}
		if (resp == "nao") {
			con = new Conta(numero, nome);
			
		System.out.println("Informações : " + con);}
		 
		
		System.out.println("Qual operação gostaria de realizar");

		System.out.print("1 - deposito  ");
		System.out.println("2- saque");

		String altnv = sc.nextLine();
		
		con = new Conta(numero, nome, numero);
		
		if (altnv == "1") {

			System.out.print("Insira um valor de depósito: ");
			double depoValor = sc.nextDouble();
			con.Deposito(depoValor);
			System.out.println("Saldo atual: " + con.getSaldo());

		} else if (altnv == "2") {
			System.out.println("Quanto gostaria de sacar? Temos uma taxa de R$ 5 em cada saque efetuado");
			double valorSaque = sc.nextDouble();
			con.Saque(valorSaque);
			System.out.println("Saldo atual: " + con.getSaldo());
		}
		sc.close();
	}

		}

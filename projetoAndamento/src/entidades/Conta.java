package entidades;

import java.util.Scanner;

public class Conta {
	Scanner sc = new Scanner(System.in);
	private int numeroConta;
	private String nome;
	private double saldo;
	
	
	public Conta( int numeroConta, String nome) {
			this.numeroConta = numeroConta;
			this.nome = nome;
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSaldo() {
		return saldo;
	}



	public Conta(int numeroConta, String nome, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public void Deposito(double quantia) {
		saldo += quantia;
		
	}
	public void Saque ( double quantia) {
		saldo -= quantia + 5;
		
	}

	public String toString() {
		return "Conta"
				+ numeroConta
				+ ", Nome do titular: "
				+ nome
				+ ", Saldo atual: "
				+ saldo;
	}}
		

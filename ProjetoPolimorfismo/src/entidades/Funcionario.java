package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//superclasse

public class Funcionario {

	
	private String nome;
	protected int horas;
	protected Double valorPorHora;
	
	   Scanner sc = new Scanner(System.in);
	List<Funcionario> lista = new ArrayList<>();
	
	public void addFuncionario(Funcionario funci) {
		lista.add(funci);
	}

	public Funcionario() {
		super();
	}

	public Funcionario(String nome, int horas, Double valorPorHora) {
		super();
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	public Double Pagamento(Double valor) {
		
		return horas * valorPorHora;
		
	}



	}
	
	


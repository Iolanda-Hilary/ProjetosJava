package Entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

	private String nome;
	private WorkerLevel level;
	private Double BaseSalary;
	// Associação de Objetos
	public Department dep;
	public List<HourContract> contracts = new ArrayList<>();// instancia uma lista do tipo 'HourContract' vazia

	public Worker(String workerName, String string, Double baseSalary2, Department department) {

	}

	public Worker(String nome, WorkerLevel level, Double baseSalary, Department dep) { // construtor com argumentos, mas
																						// sem a Lista

		this.nome = nome;
		this.level = level;
		BaseSalary = baseSalary;
		this.dep = dep;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return BaseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		BaseSalary = baseSalary;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	// metodos de remover e adicionar contratos
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public Double Income(int year, int month) {
		Double sum = BaseSalary; // declarada a soma com o valor do salario base
		Calendar cal = Calendar.getInstance();
		
		for (HourContract C : contracts) { // para cada 'HourContract' na lista de 'contracts' é testado encima do// 'year' e 'month' e tem o valor acrescentado na 'sum'
			cal.setTime(C.getData());
			int C_year = cal.get(Calendar.YEAR);
			int C_month = 1 + cal.get(Calendar.MONTH);
			if (year == C_year && month == C_month) {
				sum += C.totalValue();
			}
		}
		return sum;

	}

}

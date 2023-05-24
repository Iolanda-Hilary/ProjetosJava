package main;

public class ContaEmpresa extends Conta{

	private Double limiteEmprestimo;

	public ContaEmpresa() {
		super();
	}

	public ContaEmpresa(Integer numeroConta, String nomeTitular, Double saldo, Double limiteEmprestimo) {
		super(numeroConta, nomeTitular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void Emprestimo(Double emprestimo) {
		emprestimo = 5.000;
		emprestimo =+ this.getSaldo();	}
	
	

}

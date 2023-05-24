package main;

public class ContaPoupanca extends Conta {

	private Double taxaJuros;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numeroConta, String nomeTitular, Double saldo, Double taxaJuros) {
		super(numeroConta, nomeTitular, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public void SaldoAtualizado() {
		saldo += saldo * taxaJuros;
	}
	@Override
	public void Saque(Double saque) {
		saldo -= saque ; 

	}

}

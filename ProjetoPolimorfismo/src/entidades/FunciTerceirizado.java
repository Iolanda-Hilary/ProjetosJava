package entidades;

public class FunciTerceirizado extends Funcionario{
	
	private Double horasBonus;

	public FunciTerceirizado() {
		super();
	}

	public FunciTerceirizado(String nome, int horas, Double valorPorHora, Double horasBonus) {
		super(nome, horas, valorPorHora);
		this.horasBonus = horasBonus;
	}

	public Double getHorasBonus() {
		return horasBonus;
	}

	public void setHorasBonus(Double horasBonus) {
		this.horasBonus = horasBonus;
	}
	@Override
	public Double Pagamento(Double valor) {
		
		return super.Pagamento(valor) + horasBonus;
		
	}
}

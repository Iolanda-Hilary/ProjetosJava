package app;

import java.time.LocalDate;

public class Parcelas {
	private LocalDate data;
	private Double quantia;
	
	
public Parcelas(){
	
}
public Parcelas(LocalDate data, Double quantia) {

	this.data = data;
	this.quantia = quantia;
}


public LocalDate getData() {
	return data;
}


public void setData(LocalDate data) {
	this.data = data;
}


public Double getQuantia() {
	return quantia;
}


public void setQuantia(Double quantia) {
	this.quantia = quantia;
}

}

package app;

import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	System.out.println("Digite os dados do contrato");
	System.out.print("Numero do contrato: ");
	int numero = sc.nextInt();
	System.out.println("Data do contrato:");
	LocalDate data = LocalDate.parse(sc.next(), dtf);
	System.out.println("Digite o valor do contrato:");
	Double valorTotal = sc.nextDouble();
	System.out.println("Numero de parcelas");
	int parcelas = sc.nextInt();
	
	Contrato contrato = new Contrato(numero, Date, valorTotal);
	
		

	}

}

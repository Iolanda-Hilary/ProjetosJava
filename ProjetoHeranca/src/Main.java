import main.Conta;
import main.ContaEmpresa;
import main.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Conta cont = new Conta(1234, "Chico", 1200.0);
		ContaEmpresa contemp = new ContaEmpresa(4567, "Marcos Marrocos", 0.0, 1500.0);

		// upcasting

		Conta con1 = contemp; // superclasses podem receber subclasses como objeto, pois toda subclasse, é
								// derivada de uma superclasse
		Conta con2 = new ContaEmpresa(7899, "Maria Macarrão", 0.0, 500.00);
		Conta con3 = new ContaPoupanca(3443, "Dama Damasco", 1200.0, 0.90);
		
		cont.Saque(200.0);
		System.out.println(cont.getNomeTitular() + ", Saldo atual");
		System.out.println(cont.getSaldo());
		
		con3.Saque(200.0);
		System.out.println(con3.getNomeTitular() + ", Saldo atual");
		System.out.println(con3.getSaldo());
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num, hrs;
		double salario = 5.50;
		double total;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo, Digite seu número: ");
		
		num = sc.nextInt();
		System.out.println("horas trabalhadas: ");
		hrs = sc.nextInt();
		
		total = (salario * hrs);
		System.out.println("Esse mês o total foi de: " + total);
		
		
	}

}

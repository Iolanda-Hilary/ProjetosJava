import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int N;
		Scanner sc = new Scanner(System.in);
		System.out.println("DIGITE UM NUMERO");
		N = sc.nextInt();
		if (N <= 0) {
			System.out.println("numero negativo");
		} else {
			System.out.println("numero positivo");

		}
		sc.close();

	}
}

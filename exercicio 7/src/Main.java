import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A, B;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número");
		A = sc.nextInt();
		B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não sao multiplos");
				sc.close();
		}

	}
}

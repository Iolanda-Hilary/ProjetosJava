package Main;

import java.util.Scanner;

import Entities.Department;
import Entities.Worker;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome do Departamento: ");
		String departmentName = sc.nextLine();
		System.out.println("Dados do empregado:");
		System.out.print("Nome: ");
		String workerName = sc.nextLine();
		System.out.println("Hierarquia: ");
		String workerLevel = sc.nextLine();
		System.out.println("Salario base: ");
		Double baseSalary = sc.nextDouble();

		Worker workr = new Worker(workerName, workerLevel.valueOf(workerLevel), baseSalary, new Department (departmentName));

		sc.close();
	}

}

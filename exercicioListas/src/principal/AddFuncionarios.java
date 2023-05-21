package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddFuncionarios {

	Scanner sc = new Scanner(System.in);
	Entidades ent = new Entidades(0, 0, null, 0.0);

	List<Entidades> list = new ArrayList();

	{
		System.out.println("Quantos funcionarios irá adicionar?");

		int N = sc.nextInt();
		int[] vect = new int[N];
		ent.setNum(N);

		{
			System.out.println("Digite os dados abaixo: ");
			for (int i = 0; i < vect.length; i++) {
				
				System.out.print("Nome do funcionário #" + i + ": ");
				ent.setNome(sc.next());
				System.out.print("ID funcionario: ");
				ent.setId(sc.nextInt());
				list.add(ent);			
			}
			System.out.println("Foram adicionados " + ent.getNum() + " Funcionarios!!");
		}
	}


}

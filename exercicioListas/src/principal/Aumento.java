package principal;

import java.util.List;
import java.util.Scanner;

public class Aumento {
	public Aumento() {
			Entidades ent = new Entidades(0, 0, null, 1.200);
			Scanner sc = new Scanner(System.in);
			AddFuncionarios addfun = new AddFuncionarios();
				int aumento = 300;
				
				System.out.println("Insira o ID do funcionario a ser bonificado:");
				int boni = sc.nextInt();
				ent = addfun.list.stream().filter(x -> x.getId() == boni ).findFirst().orElse(null);
				Double aument = Math.sqrt(ent.getSalario() + 500);
				System.out.println(ent.getNome() + ", Parabéns pelo desempenho, seu saldo mensal é: " + aument);
								}
				}
								
					
				
				
				
			
	
		
	
	


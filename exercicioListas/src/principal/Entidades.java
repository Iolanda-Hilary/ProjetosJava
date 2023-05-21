package principal;

import java.util.Scanner;

public class Entidades {
	Scanner sc = new Scanner(System.in);
			private int num, id;
			private String nome;
			private Double salario;
			public Entidades(int num, int id, String nome, Double salario) {
				this.num = num;
				this.id = id;
				this.nome = nome;
				this.salario = salario;
			
			}
			
		
			public String toString() {
				return "ID" + id + ", Nome:" + nome + "salario: " + String.format("%.2f", salario);
			}

			public int getNum() {
				return num;
			}
			public void setNum(int num) {
				this.num = num;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public Double getSalario() {
				return salario = 1.200;
			}
		
			
			
}
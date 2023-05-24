package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.print("digite os numeros: ");
			int m = sc.nextInt(), n = sc.nextInt();
		int [][] mat = new int [m] [n];
	System.out.print("Agora, os numeros a serem ordenados: ");
	for( int i = 0; i < mat.length; i++){
	  for ( int j = 0; j < mat[i].length; j++ ){
        mat[i] [j] = sc.nextInt();
	  }}
       System.out.println("Numeros da coluna diagonal"); //posições iguais na coluna (1-1) (2-2) etc...
       for (int i = 0; i < n; i++) {
    	   System.out.println(mat[i] [i]);
       }
       int contagem = 0;
	for (int i = 0; i < mat.length; i++) {
		for (int j = 0; j < mat[i].length; j++) {
			if (mat[i][j] == 5) { contagem++;}}

				
			}
	System.out.println(" numeros maiores que 5: " + contagem);
		
	}}

package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	

 
      Retangulo rt = new Retangulo();
      System.out.println("digite a altura do retangulo");
      rt.altura = sc.nextDouble();
      System.out.println("digite a largura do retangulo");
      rt.largura =  sc.nextDouble();
    
      
   System.out.println("digite o numero da ação que deseja: 1-Area 2-perimetro 3-diagonal");
   
 	 double altv= sc.nextDouble();

    if ( altv == 1 ) {System.out.println(rt.Area());}
    else if (altv == 2) { System.out.println(rt.Perimetro());}
    else if ( altv == 3) { System.out.println( rt.Diagonal());}
    else { System.out.println("digite algo valido");
    }
  
       
	}

}

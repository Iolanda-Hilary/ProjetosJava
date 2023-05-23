package principalPrimeiro;

import telas.Personagem;

public class Principal {

	public static void main(String[] args) {
		//classe - Personagem, Obj - heroi, = new (comando de objt) e a classe novamente
		
		Personagem heroi1 = new Personagem();
        Personagem heroi2 = new Personagem();

        
        heroi2.nome = "Mr. Músculo";
        heroi2.WEAPON = "Paninho de Limpeza";
        heroi2.forca = 75;
        heroi2.NIVEL = 6;
        heroi2.HABILIDADE = "Jato de Limpeza";
      //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("Herói da vez: " + heroi2.nome);
		System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~*");
		System.out.println("Arma Mortífera: " + heroi2.WEAPON);
		System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~*");
		System.out.println("Nível: " + heroi2.NIVEL);
		System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~*");
		System.out.println("Atacou o inimigo com: " + heroi2.HABILIDADE);
		System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~*");
		System.out.println("Forca do ataque: " + heroi2.forca);
		System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~*");
		System.out.println("ENEMY HAS BEEN DEFEATED, YOU WIN");
		System.out.println(" ");
       //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		System.out.println("Herói da vez: " + heroi1.nome);
		System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~*");
		System.out.println("Arma Mortífera: " + heroi1.WEAPON);
		System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~*");
		System.out.println("Nível: " + heroi1.NIVEL);
		System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~*");
		System.out.println("Atacou o inimigo com: " + heroi1.HABILIDADE);
		System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~*");
		System.out.println("Forca do ataque: " + heroi1.forca);

		System.out.println("ENEMY HAS BEEN DEFEATED, YOU WIN");
	  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		
	}

}

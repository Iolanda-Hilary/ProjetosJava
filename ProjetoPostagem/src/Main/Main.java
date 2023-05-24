package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
	
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		Comentario comm1 = new Comentario("Tenha um dia lindo como voce");
		Comentario comm2 = new Comentario("Arrasou bisha");
		Post p1 = new Post(dt, "viagem pra niagra", "To viajando leve como alma", 21 );

		p1.addComentario(comm1);
		p1.addComentario(comm2);
		System.out.println(p1);
		System.out.println(comm1);
		System.out.println(comm2);
	}


}

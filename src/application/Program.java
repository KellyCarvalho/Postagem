package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comentario;
import entities.Postagem;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comentario c1 = new Comentario("Muito legal");
		
		Comentario c2 = new Comentario("Incrivel");
		
		Postagem p1 = new Postagem(sdf.parse("03/12/2021 13:04:00"),"Viajem","Show",3);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		System.out.println(p1.toString());
		
	}

}

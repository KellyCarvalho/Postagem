package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagem {
	
	private Date moment;
	private String titulo;
	private String conteudo;
	private int like;
	private static SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private  List<Comentario> comentarios= new ArrayList<>() ;
	public Postagem() {
		
	}
	public Postagem(Date moment, String titulo, String conteudo, int like) {
		
		this.moment = moment;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.like = like;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}
public List<Comentario> getComentarios(){
	return comentarios;
}

public void addComentario(Comentario comentario) {
	comentarios.add(comentario);
}
public void removeComentario(Comentario comentario) {
	comentarios.remove(comentario);
}

public String toString() {
	StringBuilder sb=new StringBuilder();
	sb.append(titulo + "\n");
	sb.append(like);
	sb.append(" Likes - "+"\n");
	sb.append(sdf.format(moment)+"\n");
	sb.append("Comentarios: \n");
	int i=0;
	for(Comentario c:comentarios) {
		i++;
		sb.append(i+" "+c.getText()+"\n");
		
		
	}
	
	return sb.toString();
	
}

}

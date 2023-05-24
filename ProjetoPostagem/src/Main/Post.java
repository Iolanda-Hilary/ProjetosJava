package Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date momento;
	private String titulo;
	private String conteudo;
	private Integer curtidas;

	
	private List<Comentario> comentarioss = new ArrayList<>();
	
	public Post() {
		
	}

	public Post(Date momento, String titulo, String conteudo, Integer curtidas) {
		
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.curtidas = curtidas;
		
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
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

	public Integer getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}
	
	public void addComentario(Comentario comentarios) {
		comentarioss.add(comentarios);
	}
	public void removerComentario(Comentario comentarios) {
		comentarioss.remove(comentarios);
	}

	@Override
	public String toString() {
		return "Post " + momento + "   " + titulo + ", " + conteudo + ", Likes " + curtidas;
	}
}

//--------------------------------------------------------------------------
class Comentario {
	private String comentario;

	@Override
	public String toString() {
		return  comentario ;
	}
	public Comentario() {

	}
	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Comentario(String comentario) {
		super();
		this.comentario = comentario;
	}

}
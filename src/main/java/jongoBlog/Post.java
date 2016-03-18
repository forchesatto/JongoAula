package jongoBlog;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {
	
	private LocalDate data;
	private String titulo;
	private String texto;
	private List<Comentario> comentarios;

}

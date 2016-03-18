package jongoBlog;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Comentario {
	
	private LocalDate data;
	private String autor;
	private String comentario;

}

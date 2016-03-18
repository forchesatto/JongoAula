package jongoBlog;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Blog {
	
	private String dominio;
	private LocalDate DataCriacao;
	private List<Post> posts;
	
}

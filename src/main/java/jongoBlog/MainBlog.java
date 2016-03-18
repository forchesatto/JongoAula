package jongoBlog;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.jongo.MongoCursor;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MainBlog {

	public static void main(String[] args) {
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		DB db = mongoClient.getDB("test");
		
		Jongo jongo = new Jongo(db);

		

		MongoCollection collectionBlog = jongo.getCollection("Blog");
		
		Blog blogzinho = new Blog();
		blogzinho.setDominio("blog.matador.com.br");
		blogzinho.setDataCriacao(LocalDate.now());
		
		Post postTeste = new Post();
		postTeste.setData(LocalDate.now());
		postTeste.setTexto("Primeiro Post");
		postTeste.setTitulo("Primeiro post VAMO INTER");
		
		Comentario comentario1 = new Comentario();
		comentario1.setAutor("GREMIO");
		comentario1.setComentario("GREMIO EH MELHOR");
		comentario1.setData(LocalDate.now());
		
		List<Comentario> coments = new ArrayList();
		coments.add(comentario1);
		postTeste.setComentarios(coments);
		
		List<Post> posts = new ArrayList();
		posts.add(postTeste);
		
		blogzinho.setPosts(posts);
		
		collectionBlog.insert(blogzinho);
		
		
		MongoCursor<Blog> cursorBlog = collectionBlog.find().as(Blog.class);
		
		cursorBlog.forEach(c->{
			System.out.println("BLOG:"+c.getDominio());
		});
		

	}

}

package jongoBlog;

import java.time.LocalDate;

import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.jongo.MongoCursor;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MainUpdateBlog {

	public static void main(String[] args) {
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		DB db = mongoClient.getDB("test");
		
		Jongo jongo = new Jongo(db);

		MongoCollection collectionBlog = jongo.getCollection("Blog");
		
		Blog blogMatador = collectionBlog.
				findOne("{dominio:'blog.matador.com.br'}").as(Blog.class);
		
		Post post = new Post();
		post.setData(LocalDate.now());
		post.setTexto("Post do Update");
		post.setTitulo("Post do Updat");
		blogMatador.addPost(post);
		
		collectionBlog.update("{dominio:'blog.matador.com.br'}")
							.with(blogMatador);
		
	}
}

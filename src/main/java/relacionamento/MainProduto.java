package relacionamento;

import org.bson.types.ObjectId;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;

public class MainProduto {
	public static void main(String[] args) {

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		DB db = mongoClient.getDB("test");

		Jongo jongo = new Jongo(db);

		MongoCollection collectionTipoProduto = jongo.getCollection("tipoProduto");
		
		TipoProduto tipoProduto = new TipoProduto("Tipo 1");
		
		collectionTipoProduto.insert(tipoProduto);
		
		Produto produto = new Produto();
		produto.setNome("Produto 1");
		produto.setIdTipoProduto(tipoProduto.get_id());
		produto.setValor(100.0);
		
		MongoCollection collectionProduto = jongo.getCollection("produto");
		collectionProduto.insert(produto);
		
	}
}

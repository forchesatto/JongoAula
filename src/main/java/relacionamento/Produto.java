package relacionamento;

import org.bson.types.ObjectId;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {

	private ObjectId _id;
	private String nome;
	private Double valor;
	
	private ObjectId idTipoProduto;
}

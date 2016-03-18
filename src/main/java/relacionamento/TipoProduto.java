package relacionamento;

import org.bson.types.ObjectId;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TipoProduto {

	private ObjectId _id;
	private String nome;
	
	public TipoProduto(String nome){
		this.nome = nome;
	}
}

package jongoTest;

import org.bson.types.ObjectId;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Cidade {
	
	private ObjectId _id;
	private String nome;
	private uf uf;
	
	public String getNomeUf(){
		if (uf != null){
			return uf.getNome();
		}
		return "";
		}

}

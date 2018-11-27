package entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;


@Entity(name = "FORNECEDOR")
public class Fornecedor implements Serializable {

	   
	@Id
	@GeneratedValue
	@Column(name = "IDFORNECEDOR")
	private Integer idFornecedor;
	
	@Column(name = "DESCRICAO", length = 150, nullable = false)
	private String descricao;

 
	public Integer getIdFornecedor() {
		return this.idFornecedor;
	}

	public void setIdFornecedor(Integer idFornecedor) {
		this.idFornecedor = idFornecedor;
	}   
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
   
}

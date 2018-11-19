package entity;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;


@Entity(name = "PRODUTO")
public class Produto implements Serializable {

	   
	@Id
	@Column(name = "IDPRODUTO")
	private Integer idProduto;
	
	@Column(name = "DESCRICAO", length = 150, nullable = false)
	private String descricao;
	
	@Column(name = "VALOR", length = 10, nullable = false)
	private Double valor;
	
	@Column(name = "IDFORNECEDOR", nullable = false)
	private Integer idFornecedor;
	

	public Integer getIdProduto() {
		return this.idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}   
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}   
	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(Integer idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	

	
   
}

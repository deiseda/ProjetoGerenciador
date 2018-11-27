package beans;


import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import service.FornecedorService;
import entity.Fornecedor;

@Named
@SessionScoped
public class CreateFornecedorBean implements Serializable {
	
	@EJB
	private FornecedorService fornecedorService; 
	private Fornecedor fornecedor = new Fornecedor();
	
	public String gravar() {
		fornecedorService.createOrUpdate(fornecedor);
		fornecedor = new Fornecedor();
		return null;
	}
	
	
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
	
	

	
//	public List<Fornecedor> getFornecedores(){
//		return fornecedorService.listAll();
//	}
	
	
	
}

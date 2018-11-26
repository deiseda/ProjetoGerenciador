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
public class searchFornecedorBean implements Serializable {
	
	@EJB
	private FornecedorService fornecedorService;
	private Fornecedor fornecedor = new Fornecedor();
	
	//private List<Fornecedor> fornecedoresList = new 
	
	public List<Fornecedor> getFornecedores(){
		return fornecedorService.listAll();
	}
	
	public String excluir(Integer idFornecedor) {
		fornecedorService.delete(idFornecedor);
		fornecedor = new Fornecedor();
		return null;		
	}
	
}

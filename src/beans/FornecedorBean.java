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
public class FornecedorBean implements Serializable {
	
	@EJB
	private FornecedorService fornecedorService; 
	
	public List<Fornecedor> getFornecedores(){
		return fornecedorService.listAll();
	}
	
}

package beans;


import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import service.FornecedorService;
import entity.Fornecedor;

@Named
@SessionScoped
public class FornecedorBean {
	
	@EJB
	private FornecedorService fornecedorService; 
	
	public List<Fornecedor> getFornecedor(){
		return fornecedorService.listAll();
	}
	
}

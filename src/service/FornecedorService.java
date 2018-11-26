package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entity.Fornecedor;

@Stateless
public class FornecedorService {
	
	@PersistenceContext
	public EntityManager em;
	
	public void createOrUpdate(Fornecedor fornecedor) {
		if(fornecedor.getIdFornecedor() == null) {
			em.persist(fornecedor);
		}else {
			em.merge(fornecedor);			
		}
	}
	
	public Fornecedor FindById(Integer idFornecedor) {
		return em.find(Fornecedor.class,idFornecedor);
	}
	
	public void delete(Integer idFornecedor) {		
		Fornecedor fornecedor = FindById(idFornecedor);
	    em.remove(fornecedor);		
	}
	
	public List<Fornecedor> listAll(){
		TypedQuery<Fornecedor> q = em.createQuery("SELECT f FROM Fornecedor f ORDER BY f.descricao", Fornecedor.class);
		return q.getResultList();
	}

}

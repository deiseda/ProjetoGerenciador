package service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Produto;

public class ProdutoService {
	
	@PersistenceContext
	public EntityManager em;
	
	public void CreateOrMerge(Produto produto) {
		
		if(produto.getIdProduto() == null) {
			em.persist(produto);
		}else {
			em.merge(produto);
		}
		
	}
	
	
	public Produto FindById(Integer idProduto) {
		return em.find(Produto.class, idProduto);
	}
	
	public void delete(Integer idProduto) {		
		Produto produto = FindById(idProduto);		
		em.remove(produto);
	}

}

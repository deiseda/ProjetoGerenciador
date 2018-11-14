package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entity.Cliente;

public class ClienteService {

	@PersistenceContext
	private EntityManager em;
	
	public void createOrUpdate(Cliente cliente) {
		if(cliente.getId() == null) {
			em.persist(cliente);
		} else {
			em.merge(cliente);
		}
	}
	
	public void delete(Integer clienteId) {
	    Cliente cliente = findById(clienteId);
	    em.remove(cliente);
	}
	
	public Cliente findById(Integer clienteId) {
		return em.find(Cliente.class, clienteId);
	}
	public List<Cliente> listAll(){
		TypedQuery<Cliente> q = em.createQuery("SELECT c FROM Cliente c ORDER BY c.nome", Cliente.class);
		return q.getResultList();
	}
}

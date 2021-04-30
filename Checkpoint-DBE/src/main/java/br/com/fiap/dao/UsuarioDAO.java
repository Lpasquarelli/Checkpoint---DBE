package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.model.Usuario;
import br.com.fiap.utils.JPAUtil;

public class UsuarioDAO {


public List<Usuario> getAll(){
	EntityManager manager = new JPAUtil.getEntityManager();
	TypedQuery<Usuario> query = manager.createQuery("Select * from usuarios s", Usuario.class);
	manager.close();
	return query.getResultList();
}

public void save(Usuario usuario) {
	EntityManager manager = new JPAUtil.getEntityManager();
	manager.getTransaction().begin();
	manager.persist(usuario);
	manager.getTransaction().commit();
	manager.close();
}
	
}

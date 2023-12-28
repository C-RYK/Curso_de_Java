package Teste.Basico;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
// import javax.persistence.TypedQuery;

import Modelo.Basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-jpa");
		
		EntityManager em = emf.createEntityManager();
		
//		String jpql = "SELECT U FROM Usuario U";
//		
//		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
//		query.setMaxResults(5);
//		
		List<Usuario> usuarios = em.createQuery("SELECT U FROM Usuario U", Usuario.class).setMaxResults(5).getResultList();
		
		for(Usuario u: usuarios) {
			System.out.println("ID: " + u.getId() + " Nome: " + u.getName() + " Email: " + u.getEmail());
		}
		
		em.close();
		emf.close();
		
		}
	}

package Teste.Basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.Basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-jpa");
		
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = new Usuario("Pedro Henrique Machado", "pedro.chamado@gmail.com.br");
		
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		
		
		em.close();
		emf.close();
	}
}

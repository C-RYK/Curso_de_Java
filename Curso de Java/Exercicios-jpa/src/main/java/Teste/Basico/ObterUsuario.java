package Teste.Basico;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.Basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-jpa");
		
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 2L);
		
		System.out.println( usuario.getId() + " - " + usuario.getName() + " - " + usuario.getEmail());
		
		em.close();
		emf.close();
		
	}
}

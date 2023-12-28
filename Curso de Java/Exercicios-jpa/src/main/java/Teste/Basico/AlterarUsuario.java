package Teste.Basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.Basico.Usuario;

public class AlterarUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 2L);
		
		em.getTransaction().begin();
		
		usuario.setName("Ana Carolina dos Reis Araujo");
		usuario.setEmail("anacarolinadosreis1112@hotmail.com");
		
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		
		
		em.close();
		emf.close();
		
	}
}

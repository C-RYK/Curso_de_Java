package Teste.Basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.Basico.Usuario;

public class RemoverUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 4L);
		
		if(usuario != null) {
			
			em.getTransaction().begin();
			
			em.remove(usuario);
			
			em.getTransaction().commit();
		
			System.out.println("Usuario removido");
			
		}else {
			System.out.println("Usuario não identificado.");
		}
	}
}

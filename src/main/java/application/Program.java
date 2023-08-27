package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		
//		Pessoa p1 = new Pessoa(null, "Edan Almeida", "email1@email.com");
//		Pessoa p2 = new Pessoa(null, "Maria Juliane", "email2@email.com");
//		Pessoa p3 = new Pessoa(null, "Helena Machado", "email3@email.com");
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
//		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();
//		System.out.println("Done!");
		
		/*Sempre que a operação não for uma simples consulta
		 * precisa inserir uma transação
		 * iniciar a transação e commitar*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		System.out.println("Done!");
		
		em.close();
		emf.close();
		
	}

}

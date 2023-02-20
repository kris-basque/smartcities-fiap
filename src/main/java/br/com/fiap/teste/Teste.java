package br.com.fiap.teste;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Teste {
	
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities-fiap");
		EntityManager em = fabrica.createEntityManager();
		
		em.close();
		fabrica.close();
	}

}

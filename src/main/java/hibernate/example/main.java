package hibernate.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class main 
{
	public static void main(String[]args)
	{
		
		Product product=new Product();
		product.setBrand("samsungsss");
		product.setPrice(100000);
		
		EntityManagerFactory eFactory=Persistence.createEntityManagerFactory("Connection");
		EntityManager eManager=eFactory.createEntityManager();
		EntityTransaction entityTransaction=eManager.getTransaction();
		
		
		entityTransaction.begin();
		
		eManager.persist(product);

		entityTransaction.commit();
	
	}

}

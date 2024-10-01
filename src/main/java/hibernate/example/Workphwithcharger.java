package hibernate.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mysql.cj.xdevapi.RemoveStatement;

public class Workphwithcharger 
{
	

	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Connection");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		

//		
//		et.begin();
//		em.persist(charger);
//		em.persist(phone);
//		et.commit();
		
//		
//		Phone phone=em.find(Phone.class, 2);
//		
//		et.begin();
//		em.remove(phone);
//		et.commit();
		
		
//		phone.setBrand("moto");
//		
//		et.begin();
//		em.persist(phone);
//		et.commit();
		
		
		
//		Remove using cascade
//		Phone phone=em.find(Phone.class, 2);
//		et.begin();
//		em.remove(phone);
//		et.commit();
		
		
//		Phone phone=em.find(Phone.class, 3);
//		Charger charger=em.find(Charger.class, 4);
//		
//		phone.setCharger(charger);
//		
//		et.begin();
//		em.persist(phone);
//		et.commit();
		
		
//		Phone phone=em.find(Phone.class, 3);
//		phone.setCharger(null);
//		
//		et.begin();
//		em.persist(phone);
//		et.commit();
		
		
//		Charger charger=em.find(Charger.class, 3);
//		
//		et.begin();
//		em.remove(charger);
//		et.commit();
		
//		
//		Phone phone=em.find(Phone.class, 3);
//		Charger charger=em.find(Charger.class, 1);
//		
//		et.begin();
//		phone.setCharger(charger);
//		et.commit();
//		
		
		
		Query query=em.createQuery("select p from Phone p where  p.price=18000");
		List<Phone> phones=(List<Phone>) query.getSingleResult();
		
		
		for(Phone phone:phones)
		{
			System.out.println(phone);
		}
		
		
		
		
				
	}

}

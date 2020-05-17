package com.tutorial.HibernateTutorial.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/*
 * First Level Cache example.
 */
public class App4 {
	
	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(NewCountry.class);
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);

        //populateNewCountryTable(sessionFactory);        
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        NewCountry country = (NewCountry) session.get(NewCountry.class, 1);
        System.out.println(country);
        
        NewCountry country2 = (NewCountry) session.get(NewCountry.class, 1); 
        /*
         * results are fetch here from the First Level Cache.
         * Indicated by only one SQL query in the logs.
         */
        System.out.println(country2);
        
        session.getTransaction().commit();
        
        System.out.println("Begin 2nd session");
        
        Session session2 = sessionFactory.openSession();
        session2.beginTransaction();
        
        NewCountry country3 = (NewCountry) session2.get(NewCountry.class, 1);
        /*
         * Results fetched from 2nd level cache. 
         */
        System.out.println(country3);
        
        NewCountry country4 = (NewCountry) session2.get(NewCountry.class, 1); 
        /*
         * results are fetch here from the First Level Cache.
         * Indicated by only one SQL query in the logs.
         */
        System.out.println(country4);
        
        session2.getTransaction().commit();
	}

	private static void populateNewCountryTable(SessionFactory sessionFactory) {
		Session session0 = sessionFactory.openSession();
        session0.beginTransaction();
        session0.save(getNewCountry(1, "India"));
        session0.save(getNewCountry(2, "Bhutan"));
        session0.save(getNewCountry(3, "Nepal"));
        session0.getTransaction().commit();
	}
	
	private static NewCountry getNewCountry(int countryId, String countryName) {
		return new NewCountry(countryId, countryName);
	}

}

package com.tutorial.HibernateTutorial.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/*
 * First Level Cache example.
 */
public class App3 {
	
	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Country.class);
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);

        //populateCountry(sessionFactory);
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        Country country = (Country) session.get(Country.class, 1);
        System.out.println(country);
        
        Country country2 = (Country) session.get(Country.class, 1); 
        /*
         * results are fetch here from the First Level Cache.
         * Indicated by only one SQL query in the logs.
         */
        System.out.println(country2);
        
        session.getTransaction().commit();
        
        System.out.println("Begin 2nd session");
        
        Session session2 = sessionFactory.openSession();
        session2.beginTransaction();
        
        Country country3 = (Country) session2.get(Country.class, 1);
        /*
         * As this a different session, the database is queried, and not the cache.
         */
        System.out.println(country3);
        
        Country country4 = (Country) session2.get(Country.class, 1); 
        /*
         * results are fetch here from the First Level Cache.
         * Indicated by only one SQL query in the logs.
         */
        System.out.println(country4);
        
        session2.getTransaction().commit();
	}

	private static void populateCountry(SessionFactory sessionFactory) {
		Session session0 = sessionFactory.openSession();
        session0.beginTransaction();
        session0.save(getCountry(1, "India"));
        session0.save(getCountry(2, "Bhutan"));
        session0.save(getCountry(3, "Nepal"));
        session0.getTransaction().commit();
	}
	
	private static Country getCountry(int countryId, String countryName) {
		return new Country(countryId, countryName);
	}

}

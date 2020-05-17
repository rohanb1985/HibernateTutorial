package com.tutorial.HibernateTutorial.hql;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App5 {
	
	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(NewStudent.class);
	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
	    SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
	    
	    //populateNewStudent(sessionFactory);
	    
	    //fetchViaHQL(sessionFactory);
	    fetchViaSQL(sessionFactory);
	}

	private static void fetchViaSQL(SessionFactory sessionFactory) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		SQLQuery query = session.createSQLQuery("select name, marks from new_student where marks > :b");
		query.setParameter("b", 80);
		query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);//Converts the result into a HashMap
		List<Map<String, Object>> students = query.list();
		students.forEach(s -> System.out.println(s.get("name") + " : " + s.get("marks")));
		session.getTransaction().commit();
	}

	private static void fetchViaHQL(SessionFactory sessionFactory) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from NewStudent where marks > :b");
		query.setParameter("b", 60);
		List<NewStudent> students = query.list();
		students.forEach(s -> System.out.println(s));
		session.getTransaction().commit();
	}

	private static void populateNewStudent(SessionFactory sessionFactory) {
		Session session0 = sessionFactory.openSession();
        session0.beginTransaction();
        
        Random r = new Random();
        for(int i = 0; i <= 50; i++) {
        	session0.save(new NewStudent(i, "Name"+i, r.nextInt(100)));        	
        }
        
        session0.getTransaction().commit();
	}
	
	
	
}

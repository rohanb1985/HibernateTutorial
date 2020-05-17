package com.tutorial.HibernateTutorial.FetchType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.tutorial.HibernateTutorial.mappingRelations.Laptop;
import com.tutorial.HibernateTutorial.mappingRelations.Student;

public class App2
{
    public static void main( String[] args )
    {
        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        
        Student student = (Student) session.get(Student.class, 1);
        System.out.println(student);
        
        session.getTransaction().commit();
    }
}

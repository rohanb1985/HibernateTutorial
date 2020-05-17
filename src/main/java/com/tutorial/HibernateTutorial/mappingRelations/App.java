package com.tutorial.HibernateTutorial.mappingRelations;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
        Laptop laptop = new Laptop();
        laptop.setLid(101);
        laptop.setLname("Dell");
        List<Laptop> laptopList = new ArrayList<Laptop>();
        laptopList.add(laptop);
        
        Student student = new Student();
        student.setRollNo(1);
        student.setName("Tikum");        
        student.setLaptop(laptopList);
        laptop.setStudent(student);
        
        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        
        session.save(laptop);
        session.save(student);
        
        session.getTransaction().commit();
        
    }
}

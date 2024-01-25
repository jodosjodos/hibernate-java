package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service

public class AppRelation {
    public static void main(String[] args) {
        try {
//            Laptop laptop = new Laptop();
//            laptop.setId(102);
//            laptop.setLname("Dell");
//
////           student
//            Student s = new Student();
//            s.setName("Mavin");
//            s.setRollNo(2);
//            s.setMarks(50);
//            s.getLaptop().add(laptop);
            Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
//            ServiceRegistry reg = new ServiceRegistryBuilder
            SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();
//            save
//            session.save(laptop);
//            session.save(s);
            tx.commit();


        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
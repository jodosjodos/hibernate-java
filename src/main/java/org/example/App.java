package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service

public class App {
    public static void main(String[] args) {
        try {
            Alien mollusk = new Alien();
//            mollusk.setAname("todos");
            AlienName names = new AlienName();
            names.setFname("Jean ");
            names.setLname("NSHIMYUMUKIZA");
            names.setMname("de");
            mollusk.setAname(names);
            mollusk.setColor("red");
            mollusk.setAid(104);
            Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
//            ServiceRegistry reg = new ServiceRegistryBuilder
            SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();
//            save
            session.save(mollusk);
            tx.commit();

            Alien molluskData=(Alien) session.get(Alien.class,103);
            System.out.println(molluskData);

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
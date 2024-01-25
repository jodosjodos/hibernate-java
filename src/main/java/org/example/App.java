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

            Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
            SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();


            tx.commit();


        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import org.hibernate.cfg.Configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    private static SessionFactory sf;

    public static void main(String[] args) throws ParseException {
        System.out.println("Hello World!");

        emp e = new emp();
        e.setEmpno(007);
        e.setComm(212);
        e.setDeptno(455567);
        e.setEname("mohan");
        Date d = new Date();

        e.setHiredate(new SimpleDateFormat("yyyy-MM-dd").parse("2017-11-15"));
        e.setMgr(8888);
        e.setSal(200000);
        e.setJob("AVP");

        dept d1=new dept();
        d1.setDname("Finance");
        d1.setLoc("NOida");
        d1.setDeptno(45067);



/*EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
EntityManager em=emf.createEntityManager();
em.getTransaction().begin();
em.persist(e);
em.getTransaction().commit();
em.close();
        System.out.println("saved");*/
try{
        sf = new Configuration().configure().buildSessionFactory();
    }
    catch (Throwable ex) {
        System.err.println("Failed to create sessionFactory object." + ex);
        throw new ExceptionInInitializerError(ex);
    }
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(e);

        tx.commit();

        System.out.println("Saved");

    }
}

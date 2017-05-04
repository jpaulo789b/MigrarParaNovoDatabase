/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpaulo.migrarparanovodatabase.executar;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author minerthal
 */

//public class HibernateUtil {
//
//    private static final SessionFactory    sessionFactory    = buildSessionFactory();
//
//    private static SessionFactory buildSessionFactory() {
//        try {
//            Configuration cfg = new Configuration();
//            cfg.configure("hibernate.cfg.xml");
//            return cfg.buildSessionFactory();
//        } catch (Throwable e) {
//            System.out.println("Criação inicial do objeto SessionFactory falhou. Erro: " + e);
//            throw new ExceptionInInitializerError(e);
//        }
//    }
//
//    public static SessionFactory getSessionFactory() {
//        return sessionFactory;
//    }
//}

public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

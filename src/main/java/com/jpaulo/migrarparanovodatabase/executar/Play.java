/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpaulo.migrarparanovodatabase.executar;

import com.jpaulo.migraparanovodatabase.entidades.Tabelao;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author jpaulo
 */
public class Play {
    
    public static void main(String[] args) {
         Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Tabelao> list = session.createCriteria(Tabelao.class).list();
        session.close();
    }
   
}

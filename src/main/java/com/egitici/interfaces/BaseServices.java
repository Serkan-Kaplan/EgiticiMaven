/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egitici.interfaces;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author vektorel
 */

    
    public class BaseServices<T> {
    
    public Session getSession(){
    return NewHibernateUtil.getSessionFactory().openSession();
    }
    
    public void kaydet(T t){
    Session ss = getSession();
        Transaction trs = ss.beginTransaction();
        ss.save(t);
        trs.commit();
        ss.close();
    }
    
   public void duzenle(T t){
    Session ss = getSession();
        Transaction trs = ss.beginTransaction();
        ss.update(t);
        trs.commit();
        ss.close();
    }
    
   public void sil(T t){
    Session ss = getSession();
        Transaction trs = ss.beginTransaction();
        ss.delete(t);
        trs.commit();
        ss.close();
    }
    
   public List listele(Class t){
     Session ss = getSession();
       Criteria cr = ss.createCriteria(t);
       return cr.list();
   } 
    
}
    


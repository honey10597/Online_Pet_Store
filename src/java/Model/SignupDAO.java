/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Honey
 */
public class SignupDAO {

    public boolean add(String Name, String Email, String Contact, String Password) 
    {
        Login l = new Login();
        l.setName(Name);
        l.setEmail(Email);
        l.setContact(Contact);
        l.setPassword(Password);
        
        Configuration cf = null;
        SessionFactory sf  =null;
        Session session = null;
        try{
            cf = new Configuration();
            cf.configure("hiberCfg/hibernate.cfg.xml");
            sf = cf.buildSessionFactory();
            session = sf.openSession();
            Transaction tx = session.beginTransaction();
            session.save(l); 
            tx.commit();
            return true;
        }catch(HibernateException exp)
        {
            exp.printStackTrace();
        }
        finally{
            session.close();
            sf.close();
        }
        return false;
    }
    
}

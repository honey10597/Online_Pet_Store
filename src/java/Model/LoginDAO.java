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
public class LoginDAO {
    String name;
    public boolean validate(Login ln) 
    {
        Login l = null;
        
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
        try{
            cf = new Configuration();
            cf.configure("hiberCfg/hibernate.cfg.xml");
            sf = cf.buildSessionFactory();
            session = sf.openSession();
            Transaction tx = session.beginTransaction();
            l = (Login)session.get(Login.class,ln.getEmail());
                if(l!=null)
                {
                     name=l.getName();
                    return ln.equals(l);
                }else
                {
                    return false;
                }                  
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
    public String getN()
    {
        return name;
    }
    
}

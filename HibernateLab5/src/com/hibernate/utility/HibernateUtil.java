package com.hibernate.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    
	
    public static SessionFactory getSessionFactory() {
    	 Configuration c = new Configuration(); // loads hibernate.cfg.xml
         SessionFactory sf = c.configure().buildSessionFactory();
         return sf;
    }

   
}

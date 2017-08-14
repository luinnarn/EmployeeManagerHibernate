/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Nikola
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        Configuration config = new Configuration().configure("/config/hibernate.cfg.xml");
        if (sessionFactory == null) {
            sessionFactory = config.buildSessionFactory(new StandardServiceRegistryBuilder()
                    .applySettings(config.getProperties()).build());
        }
        return sessionFactory;
    }
}

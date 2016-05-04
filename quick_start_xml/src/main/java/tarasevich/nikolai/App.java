package tarasevich.nikolai;

import org.hibernate.Session;
import tarasevich.nikolai.user.DBUser;
import tarasevich.nikolai.util.HibernateUtil;

import java.util.Date;

/**
 * @author mikalai.u.tarasevich
 */
public class App {

    public static void main(String args[]) {
        System.out.println("Maven + Hibernate + Mysql");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        DBUser user = new DBUser();

        user.setUsername("superman");
        user.setCreatedBy("system");
        user.setCreatedDate(new Date());

        session.save(user);
        session.getTransaction().commit();
    }
}

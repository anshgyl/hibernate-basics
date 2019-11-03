package com.anshgyl;

import com.anshgyl.bean.User;
import com.anshgyl.util.SessionUtil;
import org.hibernate.Session;

public class App {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("Ansh");
        user.setEmail("ansh.goyal@iiitb.org");

        Session session = SessionUtil.getSession();
        session.beginTransaction();

        session.save(user);

        session.getTransaction().commit();
        session.close();
    }
}

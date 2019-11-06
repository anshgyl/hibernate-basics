package com.anshgyl;

import com.anshgyl.bean.Address;
import com.anshgyl.bean.User;
import com.anshgyl.util.SessionUtil;
import org.hibernate.Session;

public class App {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("Ansh");
        user.setEmail("ansh.goyal@iiitb.org");

        Address address1 = new Address();
        address1.setStreet("E-City");
        address1.setCity("Bangalore");

        Address address2 = new Address();
        address2.setStreet("New Delhi");
        address2.setCity("Delhi");

        user.getAddressSet().add(address1);
        user.getAddressSet().add(address2);

        address1.setUser(user);
        address2.setUser(user);

        Session session = SessionUtil.getSession();
        session.beginTransaction();

        session.save(user);
        session.save(address1);
        session.save(address2);

        session.getTransaction().commit();
        session.close();
    }
}

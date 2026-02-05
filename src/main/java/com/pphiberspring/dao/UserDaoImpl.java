package com.pphiberspring.dao;

import com.pphiberspring.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> getAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void saveUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
    }
    @Override
    public void removeUserById(long id) {
        Session session = sessionFactory.getCurrentSession();
        User userID = session.get(User.class, id);
        if (userID != null) {
            session.delete(userID);
        }
    }
    @Override
    public User getUserById(long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class,id);
    }
}

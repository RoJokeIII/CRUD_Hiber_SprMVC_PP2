package com.pphiberspring.dao;
import com.pphiberspring.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void saveUser(User user);
    void removeUserById(long id);
    User getUserById(long id);
}

package com.pphiberspring.Service;

import com.pphiberspring.model.User;


import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUser(long id);
    User getUserById(long id);
}
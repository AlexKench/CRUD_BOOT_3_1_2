package com.maksimov.CRUD_BOOT_3_1_2.services;



import com.maksimov.CRUD_BOOT_3_1_2.models.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findOne(int id);

    void save(User user);

    void update(User user);

    void delete(int id);
}

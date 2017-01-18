package com.keemono.user;

import java.util.List;

/**
 * Created by eduard.frades on 18/1/17.
 */
public interface IUserRepository {

    User findOne(String uuid);

    User save(User user);

    User findByUsername(String username) throws Exception;

    List<User> findAll();
}

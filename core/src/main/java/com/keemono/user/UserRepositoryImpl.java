package com.keemono.user;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by eduard.frades on 18/1/17.
 */
@Repository
public class UserRepositoryImpl implements IUserRepository {
    @Override
    public User findOne(String uuid) {
        return null;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User findByUsername(String username) throws Exception {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}

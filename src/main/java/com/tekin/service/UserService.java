package com.tekin.service;

import com.tekin.domain.User;

import java.util.List;

public interface UserService {

    User save(User user);

    List<User> getList();

}
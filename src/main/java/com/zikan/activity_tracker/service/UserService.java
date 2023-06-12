package com.zikan.activity_tracker.service;

import com.zikan.activity_tracker.entity.User;
import com.zikan.activity_tracker.error.UserNotFoundException;

public interface UserService {

    User createUser(User user) throws UserNotFoundException;

    User findUserByEmailAndPassword(User user) throws UserNotFoundException;

     User findUserById(Long id) throws UserNotFoundException;


}

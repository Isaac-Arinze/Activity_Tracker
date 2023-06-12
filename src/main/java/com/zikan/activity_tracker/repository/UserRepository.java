package com.zikan.activity_tracker.repository;

import com.zikan.activity_tracker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findUserByEmailAndPassword(String email, String password);

}

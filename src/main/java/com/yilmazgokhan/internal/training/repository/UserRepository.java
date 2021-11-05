package com.yilmazgokhan.internal.training.repository;

import com.yilmazgokhan.internal.training.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    //SELECT * FROM users WHERE userId = id
    User getUserByUserId(String id);

}

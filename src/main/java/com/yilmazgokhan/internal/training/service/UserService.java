package com.yilmazgokhan.internal.training.service;

import com.yilmazgokhan.internal.training.entity.User;
import com.yilmazgokhan.internal.training.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public User saveUser(User user) {
        return repository.save(user);
    }

    public User getUser(String userId) {
        return repository.getUserByUserId(userId);
    }
}

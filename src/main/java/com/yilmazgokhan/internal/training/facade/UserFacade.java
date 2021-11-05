package com.yilmazgokhan.internal.training.facade;

import com.yilmazgokhan.internal.training.entity.User;
import com.yilmazgokhan.internal.training.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserFacade {

    private final UserService userService;

    public User saveUser(User user) {
        if (user.getName() == "")
            return null;
        return userService.saveUser(user);
    }

    public User getUser(String userId) {
        return userService.getUser(userId);
    }
}

package com.yilmazgokhan.internal.training.contreller;

import com.yilmazgokhan.internal.training.entity.User;
import com.yilmazgokhan.internal.training.facade.UserFacade;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
@Api(value = "/user", tags = "User APIs")
public class UserController {

    private final UserFacade facade;

    @PostMapping("/save")
    @ApiOperation(value = "Save user", response = User.class)
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        return ResponseEntity.ok(facade.saveUser(user));
    }

    @GetMapping("/get")
    @ApiOperation(value = "Get user by id", response = User.class)
    public ResponseEntity<?> getUser(@RequestParam String userId) {
        return ResponseEntity.ok(facade.getUser(userId));
    }
}

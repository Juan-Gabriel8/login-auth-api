package com.jgroup.login_auth_api.adapters.in.controller;

import com.jgroup.login_auth_api.adapters.in.controller.mapper.UserMapper;
import com.jgroup.login_auth_api.adapters.in.controller.request.UserRequest;
import com.jgroup.login_auth_api.app.ports.in.UserInputPort;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserMapper userMapper;

    private final UserInputPort userInputPort;

    public UserController(UserMapper userMapper, UserInputPort userInputPort) {
        this.userMapper = userMapper;
        this.userInputPort = userInputPort;
    }

    @PostMapping("/register")
    public ResponseEntity<Void> registerUser(@Valid @RequestBody UserRequest userRequest) {
        var user = userMapper.toUser(userRequest);
        userInputPort.register(user);
        return ResponseEntity.ok().build();
    }
}

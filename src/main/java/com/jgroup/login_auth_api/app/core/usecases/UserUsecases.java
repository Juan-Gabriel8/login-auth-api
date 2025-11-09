package com.jgroup.login_auth_api.app.core.usecases;

import com.jgroup.login_auth_api.app.core.User;
import com.jgroup.login_auth_api.app.ports.in.UserInputPort;
import com.jgroup.login_auth_api.app.ports.out.UserOutputPort;

public class UserUsecases implements UserInputPort {

    private final UserOutputPort userOutputPort;

    public UserUsecases(UserOutputPort userOutputPort) {
        this.userOutputPort = userOutputPort;
    }

    @Override
    public void register(User user) {
        userOutputPort.register(user);

    }

    @Override
    public User findUserByEmail(String email) {
        return userOutputPort.findUserByEmail(email);
    }

}

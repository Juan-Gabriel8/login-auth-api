package com.jgroup.login_auth_api.app.ports.in;

import com.jgroup.login_auth_api.app.core.User;

public interface UserInputPort {

    void register(User user);

    User findUserByEmail(String email);
}

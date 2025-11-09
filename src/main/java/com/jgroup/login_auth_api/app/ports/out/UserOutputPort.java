package com.jgroup.login_auth_api.app.ports.out;

import com.jgroup.login_auth_api.app.core.User;

public interface UserOutputPort {

    void register(User user);

    User findUserByEmail(String email);
}

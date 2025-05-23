package com.jgroup.login_auth_api.app.ports.out;

import com.jgroup.login_auth_api.app.core.domain.User;

public interface UserOutputPort {

    void register(User user);

    User findUserByEmail(String email);
}

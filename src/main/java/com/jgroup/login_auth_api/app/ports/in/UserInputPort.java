package com.jgroup.login_auth_api.app.ports.in;

import com.jgroup.login_auth_api.app.core.domain.User;

public interface UserInputPort {

    void register(User user);
}

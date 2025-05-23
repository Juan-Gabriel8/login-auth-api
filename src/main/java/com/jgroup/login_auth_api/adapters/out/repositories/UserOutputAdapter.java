package com.jgroup.login_auth_api.adapters.out.repositories;

import com.jgroup.login_auth_api.adapters.out.repositories.mapper.UserEntityMapper;
import com.jgroup.login_auth_api.app.core.domain.User;
import com.jgroup.login_auth_api.app.ports.out.UserOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserOutputAdapter implements UserOutputPort {

    @Autowired
    private UserJpaRepository userJpaRepository;
    @Autowired
    private UserEntityMapper userEntityMapper;
    @Override
    public void register(User user) {
        var userEntity = userEntityMapper.toUserEntity(user);
        userJpaRepository.save(userEntity);
    }
}

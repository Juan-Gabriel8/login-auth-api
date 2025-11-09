package com.jgroup.login_auth_api.adapters.out.repositories;

import com.jgroup.login_auth_api.adapters.out.repositories.mapper.UserEntityMapper;
import com.jgroup.login_auth_api.app.core.Role;
import com.jgroup.login_auth_api.app.core.User;
import com.jgroup.login_auth_api.app.ports.out.UserOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserOutputAdapter implements UserOutputPort {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @Autowired
    private RoleJpaRepository roleJpaRepository;
    @Autowired
    private UserEntityMapper userEntityMapper;
    @Override
    public void register(User user) {
        var userEntity = userEntityMapper.toUserEntity(user);
        userJpaRepository.save(userEntity);
    }

    @Override
    public User findUserByEmail(String email) {
        return userJpaRepository.findByEmail(email);
    }

    private Role checkRoleExist() {
        Role role = new Role();
        role.setName("ROLE_ADMIM");
        return roleJpaRepository.save(role);
    }
}

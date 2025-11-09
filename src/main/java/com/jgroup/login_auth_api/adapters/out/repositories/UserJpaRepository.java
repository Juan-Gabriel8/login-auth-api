package com.jgroup.login_auth_api.adapters.out.repositories;

import com.jgroup.login_auth_api.adapters.out.repositories.entities.UserEntity;
import com.jgroup.login_auth_api.app.core.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {

    User findByEmail(String email);
}

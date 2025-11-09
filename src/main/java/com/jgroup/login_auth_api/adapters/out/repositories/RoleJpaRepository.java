package com.jgroup.login_auth_api.adapters.out.repositories;

import com.jgroup.login_auth_api.app.core.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleJpaRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}

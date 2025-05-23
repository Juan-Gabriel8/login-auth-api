package com.jgroup.login_auth_api.adapters.out.repositories.mapper;

import com.jgroup.login_auth_api.adapters.out.repositories.entities.UserEntity;
import com.jgroup.login_auth_api.app.core.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {

    UserEntity toUserEntity(User user);
}

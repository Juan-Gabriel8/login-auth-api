package com.jgroup.login_auth_api.adapters.in.controller.mapper;

import com.jgroup.login_auth_api.adapters.in.controller.request.UserRequest;
import com.jgroup.login_auth_api.app.core.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User toUser(UserRequest userRequest);

}

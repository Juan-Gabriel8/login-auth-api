package com.jgroup.login_auth_api.config;

import com.jgroup.login_auth_api.app.core.usecases.UserUsecases;
import com.jgroup.login_auth_api.app.ports.in.UserInputPort;
import com.jgroup.login_auth_api.app.ports.out.UserOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public UserInputPort userInputPort(UserOutputPort userOutputPort) {
        return new UserUsecases(userOutputPort);
    }
}

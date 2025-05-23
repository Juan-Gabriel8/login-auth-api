package com.jgroup.login_auth_api.adapters.in.controller.request;

import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    private String name;

    private String email;

    private String cellPhone;

    private String password;
}

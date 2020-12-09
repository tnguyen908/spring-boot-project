package com.apps.developerblog.photoapp.api.users.ui.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginRequestModel {
    private String email;
    private String password;
}

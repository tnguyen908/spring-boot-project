package com.apps.developerblog.photoapp.api.users.ui.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class CreateUserRequestModel {
    @NotNull(message = "First name can not be null.")
    @Size(min = 2, message = "First name must not be less that two character.")
    public String firstName;

    @NotNull(message = "Last name can not be null.")
    @Size(min = 2, message = "Last name must not be less that two character.")
    public String lastName;

    @NotNull(message = "Password can not be null.")
    @Size(min = 8, max = 16, message = "Password must be equal or greater than 8 characters and less than 16 character.")
    public String password;

    @Email
    @NotNull(message = "Email can not be null.")
    public String email;
}

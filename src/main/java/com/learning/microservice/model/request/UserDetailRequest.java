package com.learning.microservice.model.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserDetailRequest{
    @NotNull(message="firstname can not be null")
    private String firstName;
    @NotNull(message="lastname can not be null")
    private String lastName;
    @NotNull(message="Password can not be null")
    @Size(min=7, max=16, message="length of password should be equal or greater than 7 character and less than 17 character")
    private String password;
    @NotNull(message="Email can not be null")
    @Email
    private String email;
}

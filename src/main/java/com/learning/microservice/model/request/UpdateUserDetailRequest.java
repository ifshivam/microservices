package com.learning.microservice.model.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
@Getter
@Setter
public class UpdateUserDetailRequest{
    @NotNull(message="firstname can not be null")
    private String firstName;
    @NotNull(message="lastname can not be null")
    private String lastName;
}

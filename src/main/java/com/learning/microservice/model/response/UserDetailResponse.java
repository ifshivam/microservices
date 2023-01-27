package com.learning.microservice.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDetailResponse{
  private String userId;
  private String firstName;
  private String lastName;
  private String email;
}

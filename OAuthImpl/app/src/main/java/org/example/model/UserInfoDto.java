package org.example.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import org.example.entities.UserInfo;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserInfoDto extends UserInfo {

    private String username;
    private String lastName;
    private Long phoneNumber;
    private String email;
}

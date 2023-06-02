package slagalica.quiz.infrastucture.Response;

import lombok.Data;

@Data
public class UserResponse {

    private Long id;

    private int userscore;

    private String username;
}

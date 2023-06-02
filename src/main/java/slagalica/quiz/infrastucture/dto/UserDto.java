package slagalica.quiz.infrastucture.dto;

import lombok.Data;
import slagalica.quiz.infrastucture.Request.UserRequest;
import slagalica.quiz.infrastucture.Response.UserResponse;

@Data
public class UserDto {
    private Long id;

    private int userscore;
    private String username;


    public static UserDto fromRequestToDto(UserRequest userRequest){
        UserDto userDto = new UserDto();
        userDto.setUsername(userRequest.getUsername());
        userDto.setUserscore(userRequest.getUserscore());
        return userDto;
    };

    public UserResponse fromDtoToResponse(){
        UserResponse userResponse = new UserResponse();
        userResponse.setId(this.getId());
        userResponse.setUsername(this.getUsername());
        userResponse.setUserscore(this.getUserscore());
        return userResponse;
    }
}

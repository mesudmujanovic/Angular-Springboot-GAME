package slagalica.quiz.Service;

import slagalica.quiz.infrastucture.dto.UserDto;

import java.util.List;

public interface UserService {
    public UserDto createUser(UserDto userDto);

    public List<UserDto> getAllUsers();
}

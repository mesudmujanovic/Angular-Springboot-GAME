package slagalica.quiz.infrastucture.Mapper;

import slagalica.quiz.Enitity.UserEntity;
import slagalica.quiz.Intergration.DtoMapper;
import slagalica.quiz.infrastucture.dto.UserDto;

public enum UserDtoMapper implements DtoMapper<UserDto, UserEntity> {
    INSTANCE;

    @Override
    public UserDto apply(UserEntity userEntity) {
        UserDto userDto = new UserDto();
        userDto.setId(userEntity.getId());
        userDto.setUsername(userEntity.getUsername());
        userDto.setUserscore(userEntity.getUserscore());
        return userDto;
    }
}

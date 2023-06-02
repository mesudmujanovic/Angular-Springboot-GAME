package slagalica.quiz.infrastucture.Mapper;
import slagalica.quiz.Enitity.UserEntity;
import slagalica.quiz.Intergration.DtoMapper;
import slagalica.quiz.infrastucture.dto.UserDto;

public enum UserMapper implements DtoMapper<UserEntity, UserDto> {
    INSTANCE;

    @Override
    public UserEntity apply(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userDto.getId());
        userEntity.setUsername(userDto.getUsername());
        userEntity.setUserscore(userDto.getUserscore());
        return userEntity;
    }
}

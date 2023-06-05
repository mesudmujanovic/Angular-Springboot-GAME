package slagalica.quiz.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import slagalica.quiz.Enitity.UserEntity;
import slagalica.quiz.Repo.UserRepo;
import slagalica.quiz.Service.UserService;
import slagalica.quiz.infrastucture.Mapper.UserDtoMapper;
import slagalica.quiz.infrastucture.Mapper.UserMapper;
import slagalica.quiz.infrastucture.dto.UserDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;


    @Override
    public UserDto createUser(UserDto userDto) {
        UserEntity userEntity = UserMapper.INSTANCE.apply(userDto);
        UserEntity userEntitySave = userRepo.save(userEntity);
        return UserDtoMapper.INSTANCE.apply(userEntitySave);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<UserEntity> userList = userRepo.findAll();
        List<UserDto> userDtoList = userList.stream().map(users -> UserDtoMapper.INSTANCE.apply(users)).collect(Collectors.toList());
        userDtoList.sort(UserDto::compareTo);
        return userDtoList;
    }
}

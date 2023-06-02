package slagalica.quiz.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import slagalica.quiz.Service.UserService;
import slagalica.quiz.infrastucture.Request.UserRequest;
import slagalica.quiz.infrastucture.Response.UserResponse;
import slagalica.quiz.infrastucture.dto.UserDto;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest userRequest){
        UserDto userDto = UserDto.fromRequestToDto(userRequest);
        UserDto saveUser = userService.createUser(userDto);
        return ResponseEntity.ok(saveUser.fromDtoToResponse());
    }

    @GetMapping("allUsers")
    public ResponseEntity<List<UserResponse>> getAllUsers(){
        List<UserDto> userDtoList = userService.getAllUsers();
        return ResponseEntity.ok(userDtoList.stream().map(users -> users.fromDtoToResponse()).collect(Collectors.toList()));
    }

}

package rest_api.springboot_restful_webservices.service;

import rest_api.springboot_restful_webservices.dto.UserDto;
import rest_api.springboot_restful_webservices.entity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);
    UserDto getUserById(Long Id);
    List<UserDto> getAllUsers();
    UserDto updateUser(UserDto userDto);
    void deleteUser(Long userId);
}

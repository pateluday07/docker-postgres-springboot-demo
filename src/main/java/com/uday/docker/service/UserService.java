package com.uday.docker.service;

import com.uday.docker.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto save(UserDto userDto);

    UserDto update(UserDto userDto);

    UserDto getById(Long id);

    List<UserDto> getAll();

    void deleteById(Long id);
}

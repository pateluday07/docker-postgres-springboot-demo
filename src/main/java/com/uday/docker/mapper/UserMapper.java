package com.uday.docker.mapper;

import org.mapstruct.Mapper;

import com.uday.docker.dto.UserDto;
import com.uday.docker.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity toEntity(UserDto userDto);

    UserDto toDto(UserEntity userEntity);
}

package com.kov.helper;

import com.kov.dto.UserDto;
import com.kov.entity.User;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Kovantonlenko on 7/14/2016.
 */
public class Transformer {

    public static UserDto transformUserToUserDTO(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setAge(user.getAge());
        return userDto;
    }

    public static List<UserDto> transformListUserToUserDTO(List<User> users) {
        List<UserDto> userDtos = new LinkedList<>();
        for (User user : users) {
            UserDto userDto = transformUserToUserDTO(user);
            userDtos.add(userDto);
        }
        return userDtos;
    }
}

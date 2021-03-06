package webproject.com.lap.helper;

import webproject.com.lap.dto.UserDto;
import webproject.com.lap.entity.User;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Kovantonlenko on 7/14/2016.
 */
public class Transformer {

    public static UserDto transformUserToUserDTO(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getName());
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

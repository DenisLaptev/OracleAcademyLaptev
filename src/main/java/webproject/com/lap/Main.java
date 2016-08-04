package webproject.com.lap;

import webproject.com.lap.dto.UserDto;
import webproject.com.lap.service.api.UserService;
import webproject.com.lap.service.impl.UserServiceImpl;

import java.util.List;

/**
 * Created by Kovantonlenko on 7/14/2016.
 */
public class Main {
    public static void main(String[] args) {
        UserService userService = UserServiceImpl.getInstance();
        List<UserDto> allUsers = userService.getAllUsers();
        System.out.println(allUsers);
    }
}

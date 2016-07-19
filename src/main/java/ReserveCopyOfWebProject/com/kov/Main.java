package ReserveCopyOfWebProject.com.kov;

import ReserveCopyOfWebProject.com.kov.dto.UserDto;
import ReserveCopyOfWebProject.com.kov.service.api.UserService;
import ReserveCopyOfWebProject.com.kov.service.impl.UserServiceImpl;

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

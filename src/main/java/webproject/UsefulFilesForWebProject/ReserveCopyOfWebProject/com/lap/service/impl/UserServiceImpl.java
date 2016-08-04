package webproject.UsefulFilesForWebProject.ReserveCopyOfWebProject.com.lap.service.impl;

import webproject.UsefulFilesForWebProject.ReserveCopyOfWebProject.com.lap.dao.api.UserDao;
import webproject.UsefulFilesForWebProject.ReserveCopyOfWebProject.com.lap.dao.impl.UserDaoImpl;
import webproject.UsefulFilesForWebProject.ReserveCopyOfWebProject.com.lap.dto.UserDto;
import webproject.UsefulFilesForWebProject.ReserveCopyOfWebProject.com.lap.entity.User;
import webproject.UsefulFilesForWebProject.ReserveCopyOfWebProject.com.lap.helper.Transformer;
import webproject.UsefulFilesForWebProject.ReserveCopyOfWebProject.com.lap.service.api.UserService;

import java.util.List;

/**
 * Created by Kovantonlenko on 6/16/2016.
 */
public class UserServiceImpl implements UserService {

    private static UserService userService;
    private UserDao userDao;

    private UserServiceImpl() {
        userDao = UserDaoImpl.getInstance();
    }

    public static UserService getInstance() {
        if (userService == null) {
            synchronized (UserServiceImpl.class) {
                if (userService == null) {
                    userService = new UserServiceImpl();
                }
            }
        }
        return userService;
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userDao.findAll();
        List<UserDto> userDtos = Transformer.transformListUserToUserDTO(users);
        return userDtos;
    }

    @Override
    public UserDto getUserById(long id) {
        //todo add implementation
        UserDto userDto = new UserDto();
        userDto.setId(id);
        return userDto;
    }

    @Override
    public void createUser(UserDto userDto) {
        //todo add implementation
    }

    @Override
    public boolean deleteUser(long id) {
        //todo add implementation
        return true;
    }
}

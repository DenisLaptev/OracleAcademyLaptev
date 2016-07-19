package com.kov.service.impl;

import com.kov.dao.api.UserDao;
import com.kov.dao.impl.UserDaoImpl;
import com.kov.dto.UserDto;
import com.kov.entity.User;
import com.kov.helper.Transformer;
import com.kov.service.api.UserService;

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
            synchronized (com.kov.service.impl.UserServiceImpl.class) {
                if (userService == null) {
                    userService = new com.kov.service.impl.UserServiceImpl();
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

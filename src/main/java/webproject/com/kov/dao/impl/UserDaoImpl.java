package webproject.com.kov.dao.impl;

import webproject.com.kov.dao.api.UserDao;
import webproject.com.kov.db_util.DataSource;
import webproject.com.kov.entity.User;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Kovantonlenko on 7/14/2016.
 */
public class UserDaoImpl implements UserDao {

    private static UserDao userDao;
    private static final String SELECT_ALL_USERS = "select * from user";
    private static final String SELECT_USER_BY_ID = "select  from user where id = ?";
    private static final String DELETE_USER_BY_ID = "delete  from user where id = ?";
    private static final String CREATE_USER = "INSERT INTO user VALUES (?, ?, ?)";



    private DataSource dataSource;

    private UserDaoImpl() {
        dataSource = DataSource.getInstance();
    }

    public static UserDao getInstance() {
        if (userDao == null) {
            synchronized (UserDaoImpl.class) {
                if (userDao == null) {
                    userDao = new UserDaoImpl();
                }
            }
        }
        return userDao;
    }

    @Override
    public List<User> findAll() {
        Connection connection = dataSource.getConnection();
        List<User> users = new LinkedList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL_USERS);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getLong("id"));
                user.setFirstName(resultSet.getString("name"));
                user.setAge(resultSet.getString("age"));

                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return users;
    }

    @Override
    public User findById(long id) {
        Connection connection = dataSource.getConnection();
        User user = new User();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

                user.setId(resultSet.getLong("id"));
                user.setFirstName(resultSet.getString("name"));
                user.setAge(resultSet.getString("age"));

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return user;
    }

    @Override
    public void delete(long id) {
        Connection connection = dataSource.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER_BY_ID + id);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean create(User user) {

        boolean isCreate = false;
        /*
        поля класса User:

        private Long id;
        private String firstName;
        private String age;
        */
        Connection connection = dataSource.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(CREATE_USER);

            preparedStatement.setLong(1, user.getId());
            preparedStatement.setString(2, user.getFirstName());
            preparedStatement.setString(3, user.getAge());

            preparedStatement.execute();
            isCreate = true;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return isCreate;
    }
}

package ReserveCopyOfWebProject.com.kov.dao.impl;

import ReserveCopyOfWebProject.com.kov.dao.api.UserDao;
import ReserveCopyOfWebProject.com.kov.db_util.DataSource;
import ReserveCopyOfWebProject.com.kov.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Kovantonlenko on 7/14/2016.
 */
public class UserDaoImpl implements UserDao {

    private static UserDao userDao;
    private static final String SELECT_ALL_USERS = "select * from user";

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
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public boolean create(User user) {
        return false;
    }
}

package webproject.UsefulFilesForWebProject.ReserveCopyOfWebProject.com.lap.dao.api;

import webproject.UsefulFilesForWebProject.ReserveCopyOfWebProject.com.lap.entity.User;

import java.util.List;

/**
 * Created by Kovantonlenko on 7/14/2016.
 */
public interface UserDao {
    List<User> findAll();

    User findById(long id);

    void delete(long id);

    boolean create(User user);
}

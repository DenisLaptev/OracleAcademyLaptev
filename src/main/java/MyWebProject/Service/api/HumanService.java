package MyWebProject.Service.api;

import MyWebProject.Entity.Human;

/**
 * Created by lapte on 16.06.2016.
 */
public interface HumanService {
    public Human getUserById(long userId);

    public Human createUser();

    public String deleteUser(long userId);
}

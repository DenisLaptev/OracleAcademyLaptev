package MyWebProject.Service.impl;

import MyWebProject.Entity.Human;
import MyWebProject.Service.api.UserService;


/**
 * Created by lapte on 16.06.2016.
 */
public class UserServiceImpl implements UserService {
    public Human getUserById (long userId){
        Human user = new Human();
        return user;
    }

    public Human createUser (){
        Human user = new Human();
        return user;
    }

    public String deleteUser (long userId){
        String str = null;
        return str;
    }
}
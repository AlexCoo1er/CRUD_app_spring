package web.dao;



import web.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUser (int id);

    void removeUser (int id);

    void updateUser (User user, int id);

}

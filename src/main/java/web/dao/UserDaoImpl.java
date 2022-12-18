package web.dao;

import org.springframework.stereotype.Repository;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository //специальный компонент, используется для ДАО
public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {

    }

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select user from User user", User.class).getResultList();

    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getUser(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void removeUser(int id) {
        entityManager.remove(getUser(id));
    }

    @Override
    public void updateUser(User userUpdate, int id) {
        User user = getUser(id);
        user.setName(userUpdate.getName());
        user.setLastName(userUpdate.getLastName());
        user.setAge(userUpdate.getAge());

    }


}

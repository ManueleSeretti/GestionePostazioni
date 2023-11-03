package ManueleSeretti.DAO;

import ManueleSeretti.Entities.User;

import java.util.List;

public interface IUserDao {


    public void save(User user);

    public void findByIdAndUpdate(long id, User user);

    public void findByIdAndDelete(long id);

    public User findById(long id);

    public List<User> findAll();
}

package ManueleSeretti.DAO;

import ManueleSeretti.Entities.User;
import ManueleSeretti.exceptions.ItemNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserDao {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void findByIdAndUpdate(long id, User user) {

    }

    @Override
    public void findByIdAndDelete(long id) {
        User utente = this.findById(id);
        userRepository.delete(utente);
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}

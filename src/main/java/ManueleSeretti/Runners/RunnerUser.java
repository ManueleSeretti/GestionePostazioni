package ManueleSeretti.Runners;

import ManueleSeretti.DAO.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class RunnerUser implements CommandLineRunner {
    @Autowired
    private IUserDao userDao;

    @Override
    public void run(String... args) throws Exception {

//        for (int i = 0; i < 50; i++) {
//            User utente = User.builder().build();
//            userDao.save(utente);
//        }

    }
}

package ManueleSeretti.Runners;

import ManueleSeretti.DAO.IEdificioDao;
import ManueleSeretti.Entities.Edificio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class RunnerEdificio implements CommandLineRunner {
    @Autowired
    private IEdificioDao edificioDao;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Edificio edificio = Edificio.builder().build();
            edificioDao.save(edificio);
        }

    }
}

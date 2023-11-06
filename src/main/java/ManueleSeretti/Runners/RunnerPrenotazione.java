package ManueleSeretti.Runners;

import ManueleSeretti.DAO.IPostazioneDao;
import ManueleSeretti.DAO.IPrenotazioneDao;
import ManueleSeretti.DAO.IUserDao;
import ManueleSeretti.Entities.Postazione;
import ManueleSeretti.Entities.Prenotazione;
import ManueleSeretti.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@Component
@Order(4)
public class RunnerPrenotazione implements CommandLineRunner {
    @Autowired
    private IPostazioneDao postazioneDao;
    @Autowired
    private IUserDao userDao;
    @Autowired
    private IPrenotazioneDao prenotazioneDao;

    @Override
    public void run(String... args) throws Exception {
        List<Postazione> listaPost = postazioneDao.findAll();
        List<User> listaUser = userDao.findAll();
        Random rndm = new Random();
        for (int i = 0; i < 100; i++) {
            LocalDate d = LocalDate.now().minusYears(rndm.nextInt(0, 1)).minusDays(rndm.nextInt(0, 365));
            User u = listaUser.get(rndm.nextInt(0, listaUser.size() - 1));
            Postazione p = listaPost.get(rndm.nextInt(0, listaPost.size() - 1));
            Prenotazione prenotazione = new Prenotazione(d, u, p);
            prenotazioneDao.save(prenotazione);

        }
    }
}

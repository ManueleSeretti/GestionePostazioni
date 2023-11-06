package ManueleSeretti.Runners;

import ManueleSeretti.DAO.IEdificioDao;
import ManueleSeretti.DAO.IPostazioneDao;
import ManueleSeretti.Entities.Edificio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
@Order(3)
public class RunnerPostazione implements CommandLineRunner {
    @Autowired
    private IEdificioDao edificioDao;
    @Autowired
    private IPostazioneDao postazioneDao;

    @Override
    public void run(String... args) throws Exception {
        Random rndm = new Random();
        List<Edificio> listaEdifici = edificioDao.findAll();
//
//        for (int i = 0; i < 100; i++) {
//            Postazione p = new Postazione("descrizione", 10, TipoPostazione.randomPostazione(), listaEdifici.get(rndm.nextInt(0, listaEdifici.size() - 1)));
//            postazioneDao.save(p);
//        }
    }
}

package ManueleSeretti.DAO;

import ManueleSeretti.Entities.Postazione;
import ManueleSeretti.Entities.Prenotazione;
import ManueleSeretti.Entities.User;
import ManueleSeretti.exceptions.ItemNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PrenotazioneService implements IPrenotazioneDao {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    @Override
    public void save(Prenotazione prenotazione) {
        List<Prenotazione> listaPrenByUtentaAndData = this.findByUtenteAndData(prenotazione.getUtente(), prenotazione.getData());
        List<Prenotazione> listaPrenByPostAndData = this.findByPostazioneAndData(prenotazione.getPostazione(), prenotazione.getData());

        if (listaPrenByUtentaAndData.size() == 0) {
            if (listaPrenByPostAndData.size() == 0) {
                prenotazioneRepository.save(prenotazione);
                System.out.println("prenotazione salvata correttamente");
            } else {
                System.out.println("la postazione ha gia una prenotazione per questa data!!!");
            }
        } else {
            System.out.println("l'utente ha gia una prenotazione per questa data!!!");
        }
    }

    @Override
    public void findByIdAndUpdate(long id, Prenotazione prenotazione) {
        Prenotazione p = this.findById(id);
        p.setData(prenotazione.getData());
        p.setPostazione(prenotazione.getPostazione());
        p.setUtente(prenotazione.getUtente());
        prenotazioneRepository.save(p);
    }

    @Override
    public void findByIdAndDelete(long id) {
        Prenotazione p = this.findById(id);
        prenotazioneRepository.delete(p);
    }

    @Override
    public Prenotazione findById(long id) {
        return prenotazioneRepository.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
    }

    @Override
    public List<Prenotazione> findAll() {
        return prenotazioneRepository.findAll();
    }

    @Override
    public List<Prenotazione> findByUtenteAndData(User utente, LocalDate data) {
        return prenotazioneRepository.findByUtenteAndData(utente, data);
    }


    @Override
    public List<Prenotazione> findByPostazioneAndData(Postazione postazione, LocalDate data) {
        return prenotazioneRepository.findByPostazioneAndData(postazione, data);
    }

}

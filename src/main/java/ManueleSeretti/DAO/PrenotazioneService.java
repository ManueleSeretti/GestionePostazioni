package ManueleSeretti.DAO;

import ManueleSeretti.Entities.Prenotazione;
import ManueleSeretti.exceptions.ItemNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrenotazioneService implements IPrenotazioneDao {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    @Override
    public void save(Prenotazione prenotazione) {
        prenotazioneRepository.save(prenotazione);
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
}

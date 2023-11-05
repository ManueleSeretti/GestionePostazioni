package ManueleSeretti.DAO;

import ManueleSeretti.Entities.Postazione;
import ManueleSeretti.exceptions.ItemNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService implements IPostazioneDao {
    @Autowired
    private PostazioneRepository postazioneRepository;

    @Override
    public void save(Postazione postazione) {
        postazioneRepository.save(postazione);
    }

    @Override
    public void findByIdAndUpdate(long id, Postazione postazione) {
        Postazione p = this.findById(id);
        p.setDescrizione(postazione.getDescrizione());
        p.setTipo(postazione.getTipo());
        p.setEdificio(postazione.getEdificio());
        p.setMaxPerson(postazione.getMaxPerson());
        postazioneRepository.save(p);
    }

    @Override
    public void findByIdAndDelete(long id) {
        Postazione p = this.findById(id);
        postazioneRepository.delete(p);
    }

    @Override
    public Postazione findById(long id) {
        return postazioneRepository.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
    }

    @Override
    public List<Postazione> findAll() {
        return postazioneRepository.findAll();
    }
}

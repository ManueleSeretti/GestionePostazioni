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

    }

    @Override
    public void findByIdAndDelete(long id) {
        Postazione p = postazioneRepository.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
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

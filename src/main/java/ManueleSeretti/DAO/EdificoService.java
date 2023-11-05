package ManueleSeretti.DAO;

import ManueleSeretti.Entities.Edificio;
import ManueleSeretti.exceptions.ItemNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdificoService implements IEdificioDao {
    @Autowired
    private EdificioRepository edificioRepository;

    @Override
    public void save(Edificio edificio) {
        edificioRepository.save(edificio);
    }

    @Override
    public void findByIdAndUpdate(long id, Edificio edificio) {

    }

    @Override
    public void findByIdAndDelete(long id) {

    }

    @Override
    public Edificio findById(long id) {
        return edificioRepository.findById(id).orElseThrow(() -> new ItemNotFoundException(id));

    }

    @Override
    public List<Edificio> findAll() {
        return null;
    }
}

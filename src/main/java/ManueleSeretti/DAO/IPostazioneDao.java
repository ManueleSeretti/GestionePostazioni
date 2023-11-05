package ManueleSeretti.DAO;

import ManueleSeretti.Entities.Postazione;

import java.util.List;

public interface IPostazioneDao {
    public void save(Postazione postazione);

    public void findByIdAndUpdate(long id, Postazione postazione);

    public void findByIdAndDelete(long id);

    public Postazione findById(long id);

    public List<Postazione> findAll();
}

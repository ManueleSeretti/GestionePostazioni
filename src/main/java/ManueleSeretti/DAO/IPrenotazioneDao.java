package ManueleSeretti.DAO;

import ManueleSeretti.Entities.Prenotazione;

import java.util.List;

public interface IPrenotazioneDao {
    public void save(Prenotazione prenotazione);

    public void findByIdAndUpdate(long id, Prenotazione prenotazione);

    public void findByIdAndDelete(long id);

    public Prenotazione findById(long id);

    public List<Prenotazione> findAll();
}

package ManueleSeretti.DAO;

import ManueleSeretti.Entities.Postazione;
import ManueleSeretti.Entities.Prenotazione;
import ManueleSeretti.Entities.User;

import java.time.LocalDate;
import java.util.List;

public interface IPrenotazioneDao {
    public void save(Prenotazione prenotazione);

    public void findByIdAndUpdate(long id, Prenotazione prenotazione);

    public void findByIdAndDelete(long id);

    public Prenotazione findById(long id);

    public List<Prenotazione> findAll();

    List<Prenotazione> findByUtenteAndData(User utente, LocalDate data);

    List<Prenotazione> findByPostazioneAndData(Postazione postazione, LocalDate data);


}

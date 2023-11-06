package ManueleSeretti.DAO;

import ManueleSeretti.Entities.Postazione;
import ManueleSeretti.Entities.Prenotazione;
import ManueleSeretti.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    List<Prenotazione> findByUtenteAndData(User utente, LocalDate data);

    List<Prenotazione> findByPostazioneAndData(Postazione postazione, LocalDate data);

}

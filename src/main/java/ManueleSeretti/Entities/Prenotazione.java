package ManueleSeretti.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prenotazione_id", nullable = false)
    private long prenotazioneId;
    @Column(name = "data", nullable = false)
    private LocalDate data;
    @ManyToOne
    @JoinColumn(name = "prenotazione_id", nullable = false)
    private User utente;
    @ManyToOne
    @JoinColumn(name = "postazione_id", nullable = false)
    private Postazione postazione;


    public Prenotazione(LocalDate data, User utente, Postazione postazione) {
        this.data = data;
        this.utente = utente;
        this.postazione = postazione;
    }
}

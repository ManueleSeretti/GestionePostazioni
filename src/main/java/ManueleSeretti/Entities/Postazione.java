package ManueleSeretti.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Postazione {
    @Id
    private long id;

    private String descrizione;
    private int maxPerson;
    private TipoPostazione tipo;
    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;
}

package ManueleSeretti.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Edificio {
    @Id
    private long id;
    private String name;
    private String indirizzo;
    private String city;
    @OneToMany(mappedBy = "edificio")
    private Set<Postazione> postazioneset;
}

package ManueleSeretti.Entities;

import com.github.javafaker.Faker;
import jakarta.persistence.*;
import lombok.*;

import java.util.Locale;
import java.util.Random;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Builder(builderClassName = "postazioneBuilder")
public class Postazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postazioni_id", nullable = false)
    private Long postazioniId;


    private String descrizione;
    private int maxPerson;
    @Enumerated(EnumType.STRING)
    private TipoPostazione tipo;
    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

    public Postazione(String descrizione, int maxPerson, TipoPostazione tipo, Edificio edificio) {
        this.descrizione = descrizione;
        this.maxPerson = maxPerson;
        this.tipo = tipo;
        this.edificio = edificio;
    }

    public void setPostazioniId(Long postazioniId) {
        this.postazioniId = postazioniId;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public void setTipo(TipoPostazione tipo) {
        this.tipo = tipo;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public static class postazioneBuilder {
        private Faker faker = new Faker(Locale.ITALY);
        private Random rndm = new Random();
        private String descrizione = faker.superhero().descriptor();
        private TipoPostazione tipo = TipoPostazione.randomPostazione();
        private int maxPerson = rndm.nextInt(1, 25);

    }
}

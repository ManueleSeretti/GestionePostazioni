package ManueleSeretti.Entities;

import com.github.javafaker.Faker;
import jakarta.persistence.*;
import lombok.*;

import java.util.Locale;
import java.util.Set;

@Getter
@NoArgsConstructor
@Builder(builderClassName = "edificioBuilder")
@ToString
@Entity
@AllArgsConstructor
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "edificio_id", nullable = false)
    private long edificioId;
    private String name;
    private String indirizzo;
    private String city;
    @OneToMany(mappedBy = "edificio")
    private Set<Postazione> postazioneset;

    public void setName(String name) {
        this.name = name;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static class edificioBuilder {
        private Faker faker = new Faker(Locale.ITALY);
        private String name = faker.funnyName().name();
        private String city = faker.address().cityName();
        private String indirizzo = faker.address().streetAddress();

    }


}

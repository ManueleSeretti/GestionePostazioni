package ManueleSeretti.Entities;

import com.github.javafaker.Faker;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Locale;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Builder(builderClassName = "userBuilder")
public class User {
    @Id
    @GeneratedValue
    private long Id;

    private String userName;
    private String fullName;
    private String email;

    public static class userBuilder {
        private Faker faker = new Faker(Locale.ITALY);
        private String fullName = faker.name().fullName();
        private String userName = faker.name().username();
        private String email = faker.internet().emailAddress();
    }
}

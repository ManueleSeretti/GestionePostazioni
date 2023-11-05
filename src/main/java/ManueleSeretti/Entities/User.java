package ManueleSeretti.Entities;

import com.github.javafaker.Faker;
import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private long userId;

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

package Kajaki;

import jakarta.persistence.*;
import lombok.*;
    @Entity
    @Table(name = "users")
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString

    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @NonNull
        private String username;
        @NonNull
        private String password;
}

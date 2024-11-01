package my.work.virtualclubcard.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ClubMembers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private LocalDateTime birthday;
    private String firstName;
    private String lastName;
    private Privilege privilege;
    private Role role;
    private boolean isLocked;
    private Template template;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClubMembers clubMembers = (ClubMembers) o;
        return Objects.equals(id, clubMembers.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", privilege=" + privilege +
                ", role=" + role +
                ", isLocked=" + isLocked +
                ", template=" + template +
                '}';
    }
}

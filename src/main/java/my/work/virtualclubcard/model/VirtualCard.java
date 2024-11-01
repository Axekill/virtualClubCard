package my.work.virtualclubcard.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;


@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class VirtualCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private ClubMembers clubMembers;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VirtualCard that = (VirtualCard) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    @Override
    public String toString() {
        return "VirtualCard{" +
                "id=" + id +
                ", member=" + clubMembers +
                '}';
    }
}
package br.edu.restinga.ifrs.comerlato.leveling.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "contact")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private String email;

    @ElementCollection()
    @JoinTable(
            name = "phone",
            joinColumns = @JoinColumn(name = "contactId", referencedColumnName = "id")
    )
    private List<String> phoneNumbers;
}

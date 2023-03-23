package br.edu.restinga.ifrs.comerlato.leveling.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@With
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ContactDTO {

    private Long id;
    private String name;
    private String email;
    private List<String> phoneNumbers;
}

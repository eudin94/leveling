package br.edu.restinga.ifrs.comerlato.leveling.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;
import lombok.experimental.SuperBuilder;

@Data
@With
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PhoneDTO {

    private Long id;
    private String contactId;
    private String number;

}

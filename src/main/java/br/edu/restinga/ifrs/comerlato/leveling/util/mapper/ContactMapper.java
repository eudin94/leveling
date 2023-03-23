package br.edu.restinga.ifrs.comerlato.leveling.util.mapper;

import br.edu.restinga.ifrs.comerlato.leveling.dto.ContactDTO;
import br.edu.restinga.ifrs.comerlato.leveling.entity.Contact;

import java.util.List;


public class ContactMapper {

    public static ContactDTO fromEntity(Contact contact, List<String> phoneNumbers) {
        return ContactDTO.builder()
                .id(contact.getId())
                .name(contact.getName())
                .email(contact.getEmail())
                .phoneNumbers(phoneNumbers)
                .build();
    }

    ;
}

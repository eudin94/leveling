package br.edu.restinga.ifrs.comerlato.leveling.util.mapper;

import br.edu.restinga.ifrs.comerlato.leveling.dto.ContactDTO;
import br.edu.restinga.ifrs.comerlato.leveling.entity.Contact;


public class ContactMapper {

    public static ContactDTO fromEntity(Contact contact) {
        return ContactDTO.builder()
                .id(contact.getId())
                .name(contact.getName())
                .email(contact.getEmail())
//                .phoneNumbers()
                .build();
    }

    ;
}

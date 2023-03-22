package br.edu.restinga.ifrs.comerlato.leveling.util.mapper;

import br.edu.restinga.ifrs.comerlato.leveling.dto.ContactDTO;
import br.edu.restinga.ifrs.comerlato.leveling.entity.Contact;
import org.mapstruct.Mapper;

@Mapper
public interface ContactMapper {

    ContactDTO fromEntity(Contact contact);
}

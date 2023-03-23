package br.edu.restinga.ifrs.comerlato.leveling.service.impl;

import br.edu.restinga.ifrs.comerlato.leveling.dto.ContactDTO;
import br.edu.restinga.ifrs.comerlato.leveling.entity.Contact;
import br.edu.restinga.ifrs.comerlato.leveling.repository.ContactRepository;
import br.edu.restinga.ifrs.comerlato.leveling.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static br.edu.restinga.ifrs.comerlato.leveling.util.mapper.ContactMapper.fromEntity;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    @Override
    public ContactDTO saveContact(String name, String email, List<String> phoneNumbers) {
        final var contact = contactRepository.save(
                Contact.builder().name(name).email(email).phoneNumbers(phoneNumbers).build()
        );

        return fromEntity(contact);
    }
}

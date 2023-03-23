package br.edu.restinga.ifrs.comerlato.leveling.service.impl;

import br.edu.restinga.ifrs.comerlato.leveling.dto.ContactDTO;
import br.edu.restinga.ifrs.comerlato.leveling.entity.Contact;
import br.edu.restinga.ifrs.comerlato.leveling.repository.ContactRepository;
import br.edu.restinga.ifrs.comerlato.leveling.service.ContactService;
import br.edu.restinga.ifrs.comerlato.leveling.service.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static br.edu.restinga.ifrs.comerlato.leveling.util.mapper.ContactMapper.fromEntity;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;
    private final PhoneService phoneService;

    @Override
    public List<ContactDTO> findAllContacts() {
        return contactRepository.findAll()
                .stream()
                .map(contact -> {
                    final var phoneNumbers = phoneService.findPhoneNumbers(contact.getId());
                    return fromEntity(contact, phoneNumbers);
                })
                .toList();
    }

    @Override
    public ContactDTO saveContact(final String name, final String email, final List<String> phoneNumbers) {
        final var contact = contactRepository.save(
                Contact.builder()
                        .name(name)
                        .email(email)
                        .build()
        );

        phoneService.savePhone(phoneNumbers, contact);
        return fromEntity(contact, phoneNumbers);
    }
}

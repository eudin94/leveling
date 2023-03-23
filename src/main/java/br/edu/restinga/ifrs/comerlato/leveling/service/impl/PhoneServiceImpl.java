package br.edu.restinga.ifrs.comerlato.leveling.service.impl;

import br.edu.restinga.ifrs.comerlato.leveling.entity.Contact;
import br.edu.restinga.ifrs.comerlato.leveling.entity.Phone;
import br.edu.restinga.ifrs.comerlato.leveling.repository.PhoneRepository;
import br.edu.restinga.ifrs.comerlato.leveling.service.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhoneServiceImpl implements PhoneService {

    private final PhoneRepository phoneRepository;

    @Override
    public List<String> findPhoneNumbers(Long contactId) {
        return phoneRepository.findAllPhoneNumbersByContactId(contactId);
    }

    @Override
    public void savePhone(final List<String> phoneNumbers, final Contact contact) {
        phoneNumbers.forEach(pn -> phoneRepository.save(Phone.builder()
                .contact(contact)
                .number(pn)
                .build()
        ));
    }
}

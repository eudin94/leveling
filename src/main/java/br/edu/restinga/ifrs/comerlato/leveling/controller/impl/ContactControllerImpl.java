package br.edu.restinga.ifrs.comerlato.leveling.controller.impl;

import br.edu.restinga.ifrs.comerlato.leveling.controller.ContactController;
import br.edu.restinga.ifrs.comerlato.leveling.dto.ContactDTO;
import br.edu.restinga.ifrs.comerlato.leveling.service.ContactService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@Tag(name = "Contact Controller", description = "Register and find contacts")
public class ContactControllerImpl implements ContactController {

    private final ContactService contactService;

    @Override
    public List<ContactDTO> getContacts() {
        return null;
    }

    @Override
    public ContactDTO saveContact(final String name, final String email, final List<String> phoneNumbers) {
        return contactService.saveContact(name, email, phoneNumbers);
    }
}

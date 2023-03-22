package br.edu.restinga.ifrs.comerlato.leveling.controller.impl;

import br.edu.restinga.ifrs.comerlato.leveling.controller.ContactController;
import br.edu.restinga.ifrs.comerlato.leveling.dto.ContactDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Contact Controller", description = "Register and find contacts")
public class ContactControllerImpl implements ContactController {

    @Override
    public List<ContactDTO> getContacts() {
        return null;
    }

    @Override
    public ContactDTO saveContact() {
        return null;
    }
}

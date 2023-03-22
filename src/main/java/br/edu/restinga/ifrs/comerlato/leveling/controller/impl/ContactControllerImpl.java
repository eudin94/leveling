package br.edu.restinga.ifrs.comerlato.leveling.controller.impl;

import br.edu.restinga.ifrs.comerlato.leveling.controller.ContactController;
import br.edu.restinga.ifrs.comerlato.leveling.dto.ContactDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("contact-api")
@Tag(name = "API de Contatos", description = "API ara cadastro e listagem de contatos")
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

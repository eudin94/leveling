package br.edu.restinga.ifrs.comerlato.leveling.controller;

import br.edu.restinga.ifrs.comerlato.leveling.dto.ContactDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ContactController {

    @GetMapping("list")
    List<ContactDTO> getContacts();

    @PostMapping("register")
    void saveContact(@RequestParam("name") final String name,
                     @RequestParam("email") final String email,
                     @RequestParam("phoneNumbers") final List<String> phoneNumbers);
}

package br.edu.restinga.ifrs.comerlato.leveling.controller;

import br.edu.restinga.ifrs.comerlato.leveling.dto.ContactDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface ContactController {

    @GetMapping("list")
    List<ContactDTO> getContacts();

    @PostMapping("register")
    ContactDTO saveContact();
}

package br.edu.restinga.ifrs.comerlato.leveling.service;

import br.edu.restinga.ifrs.comerlato.leveling.dto.ContactDTO;

import java.util.List;

public interface ContactService {

    List<ContactDTO> findAllContacts();

    ContactDTO saveContact(final String name, final String email, final List<String> phoneNumbers);
}

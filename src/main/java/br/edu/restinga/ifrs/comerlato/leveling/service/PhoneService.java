package br.edu.restinga.ifrs.comerlato.leveling.service;

import br.edu.restinga.ifrs.comerlato.leveling.entity.Contact;

import java.util.List;

public interface PhoneService {

    void savePhone(final List<String> phoneNumbers, final Contact contact);
}

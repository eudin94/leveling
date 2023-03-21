package br.edu.restinga.ifrs.comerlato.leveling.repository;

import br.edu.restinga.ifrs.comerlato.leveling.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}

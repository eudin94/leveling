package br.edu.restinga.ifrs.comerlato.leveling.repository;

import br.edu.restinga.ifrs.comerlato.leveling.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {

    @Query(
            "SELECT p.number FROM Phone p WHERE p.contact.id = ?1"
    )
    List<String> findAllPhoneNumbersByContactId(final Long contactId);

}

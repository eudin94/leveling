package br.edu.restinga.ifrs.comerlato.leveling.repository;

import br.edu.restinga.ifrs.comerlato.leveling.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}

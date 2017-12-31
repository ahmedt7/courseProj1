package sec.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sec.project.domain.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}

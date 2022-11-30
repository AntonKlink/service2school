package ee.service2school.domain.contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

//    @Override
//    Optional<Contact> findById(Integer contactId);

    @Query("select c from Contact c where c.user.id = ?1")
    Contact findByUserId(Integer userId);


}
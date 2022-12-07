package ee.service2school.domain.contact;


import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;


@Service
public class ContactService {

    @Resource
    private ContactRepository contactRepository;


    public Contact findByUserId(Integer userId) {

        return contactRepository.findByUserId(userId);
    }

    public void addNewContact(Contact contact) {
        contactRepository.save(contact);
    }

    public Optional<Contact> findById(Integer contactId) {
        Optional<Contact> contact = Optional.of(contactRepository.findById(contactId).get());
        return contact;
    }

    public void save(Contact contact) {
        contactRepository.save(contact);
    }
}




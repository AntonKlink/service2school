package ee.service2school.domain.contact;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;


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
}

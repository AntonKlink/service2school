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



    public void save(Contact contact) {
        contactRepository.save(contact);
    }
}




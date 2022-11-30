package ee.service2school.domain.contact;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContactService {

    @Resource
    private ContactMapper contactMapper;

    @Resource
    private ContactRepository contactRepository;


    public List<ContactDto> createProfileDto(List<Contact> contacts) {
        List<ContactDto> contactDtos = contactMapper.contactDtos(contacts);
        return contactDtos;
    }

    public ContactDto getProfileInfo(Integer userId) {
        Contact contact = contactRepository.findByUserId(userId);
        ContactDto contactDto = contactMapper.contactDto(contact);
        return contactDto;
    }
}

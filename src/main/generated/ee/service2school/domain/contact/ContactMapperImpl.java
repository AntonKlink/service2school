package ee.service2school.domain.contact;

import ee.service2school.business.login.ContactRequest;
import ee.service2school.domain.user.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-06T11:13:57+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class ContactMapperImpl implements ContactMapper {

    @Override
    public ContactDto contactDto(Contact contact) {
        if ( contact == null ) {
            return null;
        }

        ContactDto contactDto = new ContactDto();

        contactDto.setContactId( contact.getId() );
        contactDto.setContactFirstName( contact.getFirstName() );
        contactDto.setContactLastName( contact.getLastName() );
        contactDto.setContactPhone( contact.getPhone() );
        contactDto.setContactInstitution( contact.getInstitution() );
        contactDto.setUserId( contactUserId( contact ) );

        return contactDto;
    }

    @Override
    public Contact toEntity(ContactRequest request) {
        if ( request == null ) {
            return null;
        }

        Contact contact = new Contact();

        contact.setFirstName( request.getFirstName() );
        contact.setLastName( request.getLastName() );
        contact.setPhone( request.getPhone() );
        contact.setInstitution( request.getInstitution() );

        return contact;
    }

    private Integer contactUserId(Contact contact) {
        if ( contact == null ) {
            return null;
        }
        User user = contact.getUser();
        if ( user == null ) {
            return null;
        }
        Integer id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}

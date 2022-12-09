package ee.service2school.domain.contact;

import ee.service2school.business.login.ContactRequest;
import ee.service2school.business.login.ContactUpdate;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-09T09:19:31+0200",
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

        contactDto.setFirstName( contact.getFirstName() );
        contactDto.setLastName( contact.getLastName() );
        contactDto.setPhone( contact.getPhone() );
        contactDto.setInstitution( contact.getInstitution() );

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

    @Override
    public void updateContact(ContactUpdate contactUpdate, Contact contact) {
        if ( contactUpdate == null ) {
            return;
        }

        contact.setFirstName( contactUpdate.getFirstName() );
        contact.setLastName( contactUpdate.getLastName() );
        contact.setPhone( contactUpdate.getPhone() );
        contact.setInstitution( contactUpdate.getInstitution() );
    }
}

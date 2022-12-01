package ee.service2school.domain.contact;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-01T16:37:25+0200",
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

        return contactDto;
    }

    @Override
    public List<ContactDto> contactDtos(List<Contact> contacts) {
        if ( contacts == null ) {
            return null;
        }

        List<ContactDto> list = new ArrayList<ContactDto>( contacts.size() );
        for ( Contact contact : contacts ) {
            list.add( contactDto( contact ) );
        }

        return list;
    }
}

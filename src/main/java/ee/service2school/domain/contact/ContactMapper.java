package ee.service2school.domain.contact;

import ee.service2school.business.login.ContactRequest;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ContactMapper {

    @Mapping(source = "id", target = "contactId")
    @Mapping(source = "firstName", target = "contactFirstName")
    @Mapping(source = "lastName", target = "contactLastName")
    @Mapping(source = "phone", target = "contactPhone")
    @Mapping(source = "institution", target = "contactInstitution")
    ContactDto contactDto(Contact contact);

    List<ContactDto> contactDtos (List<Contact> contacts);

    Contact toEntity(ContactRequest request);


}

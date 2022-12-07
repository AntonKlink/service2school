package ee.service2school.domain.contact;

import ee.service2school.business.login.ContactRequest;
import ee.service2school.business.login.ContactUpdate;
import org.mapstruct.*;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ContactMapper {

    @Mapping(source = "id", target = "contactId")
    @Mapping(source = "firstName", target = "contactFirstName")
    @Mapping(source = "lastName", target = "contactLastName")
    @Mapping(source = "phone", target = "contactPhone")
    @Mapping(source = "institution", target = "contactInstitution")
    @Mapping(source = "user.id", target = "userId")
    ContactDto contactDto(Contact contact);


    Contact toEntity(ContactRequest request);


    @Mapping(source = "contactFirstName", target = "firstName")
    @Mapping(source = "contactLastName", target = "lastName")
    @Mapping(source = "contactPhone", target = "phone")
    @Mapping(source = "contactInstitution", target = "institution")
    void updateContact(ContactUpdate contactUpdate,@MappingTarget Contact contact);
}


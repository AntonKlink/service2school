package ee.service2school.domain.contact;

import ee.service2school.business.login.ContactRequest;
import ee.service2school.business.login.ContactUpdate;
import org.mapstruct.*;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ContactMapper {

    ContactDto contactDto(Contact contact);


    Contact toEntity(ContactRequest request);

    void updateContact(ContactUpdate contactUpdate,@MappingTarget Contact contact);
}


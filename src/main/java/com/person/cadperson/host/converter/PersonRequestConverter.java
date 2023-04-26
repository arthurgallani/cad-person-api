package com.person.cadperson.host.converter;

import com.person.cadperson.domain.Person;
import com.person.cadperson.host.data.PersonRequest;

public interface PersonRequestConverter {

    Person convert(final PersonRequest personRequest);

}

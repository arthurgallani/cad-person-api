package com.person.cadperson.host.converter;

import com.person.cadperson.domain.Person;
import com.person.cadperson.host.data.PersonResponse;

import java.util.List;

public interface PersonResponseConverter {

    PersonResponse convert(final Person person);
    List<PersonResponse> convert(List<Person> persons);
}

package com.person.cadperson.gateway.converter;

import com.person.cadperson.domain.Person;
import com.person.cadperson.gateway.database.entity.PersonEntity;

import java.util.List;

public interface PersonConverter {
    PersonEntity convert(Person person);

    Person convert(PersonEntity entity);

    List<Person> convert(List<PersonEntity> entities);
}

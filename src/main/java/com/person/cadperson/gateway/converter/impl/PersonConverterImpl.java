package com.person.cadperson.gateway.converter.impl;

import com.person.cadperson.domain.Person;
import com.person.cadperson.gateway.converter.PersonConverter;
import com.person.cadperson.gateway.database.entity.PersonEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonConverterImpl implements PersonConverter {

    @Override
    public PersonEntity convert(final Person person) {
        return PersonEntity.builder()
                .name(person.getName())
                .email(person.getEmail())
                .phone(person.getPhone())
                .address(person.getAddress())
                .idPerson(person.getId())
                .build();
    }
    @Override
    public Person convert(final PersonEntity entity) {
        return Person.builder()
                .name(entity.getName())
                .email(entity.getEmail())
                .phone(entity.getPhone())
                .address(entity.getAddress())
                .id(entity.getIdPerson())
                .build();
    }

    @Override
    public List<Person> convert(final List<PersonEntity> entities) {
        return entities.stream()
                .map(this::convert)
                .toList();
    }
}

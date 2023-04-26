package com.person.cadperson.host.converter.impl;

import com.person.cadperson.domain.Person;
import com.person.cadperson.host.converter.PersonResponseConverter;
import com.person.cadperson.host.data.PersonResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonResponseConverterImpl implements PersonResponseConverter {


    @Override
    public PersonResponse convert(Person person) {
        return PersonResponse.builder()
                .name(person.getName())
                .email(person.getEmail())
                .phone(person.getPhone())
                .address(person.getAddress())
                .id(person.getId())
                .build();
    }

    @Override
    public List<PersonResponse> convert(List<Person> persons) {
        return persons.stream()
                .map(this::convert)
                .toList();
    }
}

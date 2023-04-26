package com.person.cadperson.host.converter.impl;

import com.person.cadperson.domain.Person;
import com.person.cadperson.host.converter.PersonRequestConverter;
import com.person.cadperson.host.data.PersonRequest;

public class PersonRequestConverterImpl implements PersonRequestConverter {

    @Override
    public Person convert(PersonRequest personRequest) {
        return Person.builder()
                .name(personRequest.getName())
                .email(personRequest.getEmail())
                .phone(personRequest.getPhone())
                .address(personRequest.getAddress())
                .id(null == personRequest.getId() ? 0 : personRequest.getId())
                .build();
    }
}

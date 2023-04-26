package com.person.cadperson.useCase.impl;

import com.person.cadperson.domain.Person;
import com.person.cadperson.gateway.PersonGateway;
import com.person.cadperson.useCase.CreatePersonCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreatePersonCaseImpl implements CreatePersonCase {

    @Autowired
    private PersonGateway personGateway;

    @Override
    public Person execute(final Person person) {
        return personGateway.create(person);
    }
}

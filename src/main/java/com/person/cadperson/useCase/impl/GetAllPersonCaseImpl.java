package com.person.cadperson.useCase.impl;

import com.person.cadperson.domain.Person;
import com.person.cadperson.gateway.PersonGateway;
import com.person.cadperson.useCase.GetAllPersonCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllPersonCaseImpl implements GetAllPersonCase {

    @Autowired
    private PersonGateway personGateway;

    @Override
    public List<Person> execute() {
        return personGateway.getAll();
    }
}

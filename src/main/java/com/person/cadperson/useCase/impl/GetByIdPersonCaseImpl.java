package com.person.cadperson.useCase.impl;

import com.person.cadperson.domain.Person;
import com.person.cadperson.gateway.PersonGateway;
import com.person.cadperson.useCase.GetByIdPersonCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class GetByIdPersonCaseImpl implements GetByIdPersonCase {

    @Autowired
    private PersonGateway personGateway;

    @Override
    public Person execute(final Integer idPerson) {
        return personGateway.get(idPerson);
    }
}

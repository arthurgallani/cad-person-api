package com.person.cadperson.useCase.impl;

import com.person.cadperson.domain.Person;
import com.person.cadperson.gateway.PersonGateway;
import com.person.cadperson.useCase.CreatePersonCase;
import com.person.cadperson.useCase.DeleteByIdPersonCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteByIdPersonCaseImpl implements DeleteByIdPersonCase {

    @Autowired
    private PersonGateway personGateway;

    @Override
    public void execute(final Integer idPerson) {
        personGateway.delete(idPerson);
    }
}

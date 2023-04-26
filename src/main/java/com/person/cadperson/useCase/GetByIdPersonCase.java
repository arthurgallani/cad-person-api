package com.person.cadperson.useCase;

import com.person.cadperson.domain.Person;

public interface GetByIdPersonCase {
    Person execute(Integer idPerson);
}

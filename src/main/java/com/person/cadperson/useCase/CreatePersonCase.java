package com.person.cadperson.useCase;

import com.person.cadperson.domain.Person;

public interface CreatePersonCase {
    Person execute(Person person);
}

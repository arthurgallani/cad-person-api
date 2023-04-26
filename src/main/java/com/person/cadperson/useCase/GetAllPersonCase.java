package com.person.cadperson.useCase;

import com.person.cadperson.domain.Person;

import java.util.List;

public interface GetAllPersonCase {
    List<Person> execute();
}

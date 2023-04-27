package com.person.cadperson.gateway;

import com.person.cadperson.domain.Person;

import java.util.List;

public interface PersonGateway {

    Person create(Person person);

    List<Person> getAll();

    Person get(Integer idPerson);

    void delete(Integer idPerson);
}

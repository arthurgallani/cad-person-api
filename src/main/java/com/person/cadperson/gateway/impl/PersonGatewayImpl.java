package com.person.cadperson.gateway.impl;

import com.person.cadperson.domain.Person;
import com.person.cadperson.exception.NotFoundException;
import com.person.cadperson.gateway.PersonGateway;
import com.person.cadperson.gateway.converter.PersonConverter;
import com.person.cadperson.gateway.database.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonGatewayImpl implements PersonGateway {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonConverter personConverter;

    @Override
    public Person create(final Person person) {
        return personConverter.convert(
                personRepository.save(personConverter.convert(person)));
    }

    @Override
    public List<Person> getAll() {
        return personConverter.convert(personRepository.findAll());
    }

    @Override
    public Person get(Integer idPerson) {

        var personEntity = personRepository
                .findById(idPerson)
                .orElse(null);

        if (null == personEntity)
            throw new NotFoundException("Person not found by id: " + idPerson );

        return personConverter.convert(personEntity);

    }

    @Override
    public void delete(Integer idPerson) {
        personRepository.deleteById(idPerson);
    }
}

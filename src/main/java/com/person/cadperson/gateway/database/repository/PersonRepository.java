package com.person.cadperson.gateway.database.repository;

import com.person.cadperson.gateway.database.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {

}

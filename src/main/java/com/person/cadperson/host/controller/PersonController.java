package com.person.cadperson.host.controller;

import com.person.cadperson.exception.BadRequestException;
import com.person.cadperson.exception.NotFoundException;
import com.person.cadperson.host.converter.PersonRequestConverter;
import com.person.cadperson.host.converter.PersonResponseConverter;
import com.person.cadperson.host.data.PersonRequest;
import com.person.cadperson.host.data.PersonResponse;
import com.person.cadperson.useCase.CreatePersonCase;
import com.person.cadperson.useCase.DeleteByIdPersonCase;
import com.person.cadperson.useCase.GetAllPersonCase;
import com.person.cadperson.useCase.GetByIdPersonCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@Controller
@RequestMapping("persons")
public class PersonController {

    @Autowired
    private CreatePersonCase createPersonCase;

    @Autowired
    private GetAllPersonCase getAllPersonCase;

    @Autowired
    private DeleteByIdPersonCase deleteByIdPersonCase;

    @Autowired
    private GetByIdPersonCase getByIdPersonCase;

    @Autowired
    private PersonRequestConverter personRequestConverter;

    @Autowired
    private PersonResponseConverter personResponseConverter;

    @CrossOrigin
    @PostMapping
    public ResponseEntity<PersonResponse> save(@Valid @RequestBody PersonRequest personRequest) {
        var personResponse = personResponseConverter.convert(
                createPersonCase.execute(personRequestConverter.convert(personRequest)));
        var uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(personResponse.getId())
                .toUri();
        return ResponseEntity.created(uri).body(personResponse);
    }

    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<PersonResponse>> find() {
        return ResponseEntity.ok(
                personResponseConverter.convert(getAllPersonCase.execute()));
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<PersonResponse> findById(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok(
                personResponseConverter.convert(getByIdPersonCase.execute(id)));
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable(name = "id") Integer id) {
        deleteByIdPersonCase.execute(id);
        return ResponseEntity
                .noContent()
                .build();
    }

    @ExceptionHandler({ Exception.class, RuntimeException.class })
    public void handleExceptionInternal() {
        throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal error");
    }

    @ExceptionHandler({ BadRequestException.class })
    public void handleExceptionBadRequest() {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid request");
    }

    @ExceptionHandler({ NotFoundException.class })
    public void handleExceptionNotFound() {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Not found");
    }
}
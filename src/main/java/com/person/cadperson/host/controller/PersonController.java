package com.person.cadperson.host.controller;

import com.person.cadperson.host.converter.PersonRequestConverter;
import com.person.cadperson.host.converter.PersonResponseConverter;
import com.person.cadperson.host.data.PersonRequest;
import com.person.cadperson.host.data.PersonResponse;
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

   
}
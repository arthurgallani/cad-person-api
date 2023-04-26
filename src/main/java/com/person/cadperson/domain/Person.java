package com.person.cadperson.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Person {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
}

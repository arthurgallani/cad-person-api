package com.person.cadperson.host.data;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class PersonResponse {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
}

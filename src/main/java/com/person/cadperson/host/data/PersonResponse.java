package com.person.cadperson.host.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class PersonResponse {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
}

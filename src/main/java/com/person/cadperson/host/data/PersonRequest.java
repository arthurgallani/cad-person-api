package com.person.cadperson.host.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class PersonRequest {
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private String address;
}

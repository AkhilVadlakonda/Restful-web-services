package com.akhil.rest.webservices.restfulwebservices.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="department")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Department {

    @Id
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}

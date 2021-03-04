package com.akhil.rest.webservices.restfulwebservices.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akhil.rest.webservices.restfulwebservices.entity.Department;
import  com.akhil.rest.webservices.restfulwebservices.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController 
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
     private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody  Department departments)
    {
        log.info("inside saveDepartment method of departmentController");
        return departmentService.saveDepartments(departments);
    }
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId)
    {
        log.info("inside findDepartmentById method of departmentController");
        return departmentService.findDepartmentById(departmentId);
    }


}

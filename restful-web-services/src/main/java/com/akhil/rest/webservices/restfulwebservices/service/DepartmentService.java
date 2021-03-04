package com.akhil.rest.webservices.restfulwebservices.service;

import com.akhil.rest.webservices.restfulwebservices.entity.Department;
import com.akhil.rest.webservices.restfulwebservices.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentrepository ;

    public Department  saveDepartments(Department departments) {
        log.info("inside saveDepartment fo departmentService");
        return departmentrepository.save(departments);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("inside findDepartmentById fo departmentService");
        return departmentrepository.findDepartmentById(departmentId);
    }
}

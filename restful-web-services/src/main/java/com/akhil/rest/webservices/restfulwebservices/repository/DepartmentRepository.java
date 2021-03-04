package com.akhil.rest.webservices.restfulwebservices.repository;

import com.akhil.rest.webservices.restfulwebservices.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, Long> {

    Department findDepartmentById(Long departmentId);
}

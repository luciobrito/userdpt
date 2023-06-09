package com.devsup.userdpt.controllers;

import com.devsup.userdpt.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devsup.userdpt.entities.Department;
import java.util.List;
@RestController
@RequestMapping(value = "/department")
public class DepartmentController {
    @Autowired
    private DepartmentRepository repository;
    @GetMapping
    public List<Department> findAll(){
        List<Department> result = repository.findAll();
        return result;
    }
}

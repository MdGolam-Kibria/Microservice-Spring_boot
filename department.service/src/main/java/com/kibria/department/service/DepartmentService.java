package com.kibria.department.service;

import com.kibria.department.entity.Department;
import com.kibria.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of department service");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long id) {
        log.info("Inside findDepartmentById of department service");
        return departmentRepository.findByDepartmentId(id);
    }
}

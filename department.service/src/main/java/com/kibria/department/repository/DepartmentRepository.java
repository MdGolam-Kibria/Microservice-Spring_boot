package com.kibria.department.repository;

import com.kibria.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
Department findByDepartmentId(Long id);
}

package com.devsup.userdpt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsup.userdpt.entities.Department;
public interface DepartmentRepository extends JpaRepository<Department,Long> {

}

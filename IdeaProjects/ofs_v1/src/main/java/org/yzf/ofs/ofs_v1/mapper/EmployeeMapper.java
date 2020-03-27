package org.yzf.ofs.ofs_v1.mapper;

import org.yzf.ofs.ofs_v1.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeMapper {

    void insertBatch(List<Employee> employees);

    List<Employee> getEmployeesInfo();
}

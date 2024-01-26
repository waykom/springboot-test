package org.example.lang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.lang.bean.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    int create(Employee employee);
    int delete(Integer id);
    int update(Employee employee);
    Employee read(Integer id);
    Employee readByDepartmentName(String readByDepartmentName);
}

package org.example.lang.service;

import org.example.lang.bean.Employee;
import org.example.lang.bean.Response;
import org.example.lang.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    public Response create(Employee employee) {
        Employee temp = employeeMapper.readByDepartmentName(employee.getDepartmentName());
        if (temp != null) {
            return Response.error("该部门已存在！");
        }
        int i = employeeMapper.create(employee);
        if (i > 0) {
            return Response.ok("添加成功！");
        }
        return Response.error("添加失败！");
    }

    public Response delete(Integer id) {
        Employee employee = employeeMapper.read(id);
        if (employee == null) {
            return Response.error("该部门已被删除！");
        }
        int i = employeeMapper.delete(id);
        if (i > 0) {
            return Response.ok("删除成功！");
        }
        return Response.error("删除失败！");
    }

    public Response update(Employee employee) {
        int i = employeeMapper.update(employee);
        if (i > 0) {
            return Response.ok("更新成功！");
        }
        return Response.error("更新失败！");
    }

    public Response read(Integer id) {
        Employee employee = employeeMapper.read(id);
        return Response.ok("ok", employee);
    }
}

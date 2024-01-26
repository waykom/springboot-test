package org.example.lang.controller;

import com.alibaba.fastjson.JSONObject;
import org.example.lang.bean.Employee;
import org.example.lang.bean.Response;
import org.example.lang.mapper.EmployeeMapper;
import org.example.lang.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lang")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/create")
    public Response create(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }

    @DeleteMapping("/delete")
    public Response delete(@RequestBody JSONObject jsonObject) {
        String id = jsonObject.getString("id");
        return employeeService.delete(Integer.valueOf(id));
    }

    @PostMapping("/update")
    public Response update(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }

    @GetMapping("/read")
    public Response read(@RequestParam Integer id) {
        return employeeService.read(id);
    }

}

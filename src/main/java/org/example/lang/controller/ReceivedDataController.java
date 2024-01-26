package org.example.lang.controller;

import org.example.lang.bean.Employee;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class ReceivedDataController {

    /*
     * 以 Json 对象接收数据
     *
     * {"id": null,"departmentName": "商品部","name": "测试类"}
     * */
    @PostMapping("/json")
    public void getJson(@RequestBody JSONObject jsonObject) throws Exception {
        System.out.println(jsonObject);
    }

    /*
     * 以 List 接收数据
     *
     * [{"id": null,"departmentName": "商品部","name": "测试类"},{"id": null,"departmentName": "商品部","name": "测试类"}]
     * */
    @PostMapping("/list")
    public List<Employee> getList(@RequestBody List<Employee> list) throws Exception {
        for (Employee employee : list) {
            System.out.println(employee);
        }
        return list;
    }

    /*
     * 以 Map 接收数据
     * {"username": "zhangsan","id":"2"}
     * */
    @PostMapping("/map")
    public void getMap(@RequestBody Map<String, String> map) throws Exception {
        System.out.println(map);
    }

    /*
     * 以实体类接收数据
     * {"id": 1,"departmentName": "商品部"}
     * */

    @PostMapping("/entity")
    public void getEntity(@RequestBody Employee employee) throws Exception {
        System.out.println(employee);
    }

    /*
     * 以 RequestParam 接收数据
     * */
    @GetMapping("/params")
    public void getParams(@RequestParam Integer id, @RequestParam String name) {
        System.out.println(id + "," + name);
    }

    /*
     *  以 PathVariable 接收数据
     * */
    @GetMapping("/path/{id}/{username}")
    public void getPath(@PathVariable("id") String id, @PathVariable("username") String username) {
        System.out.println(id + "," + username);
    }
}

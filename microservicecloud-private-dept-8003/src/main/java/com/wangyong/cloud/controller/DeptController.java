package com.wangyong.cloud.controller;

import com.wangyong.cloud.entities.Department;
import com.wangyong.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by gervard on 2019/3/26.
 */
@RestController
public class DeptController {

    @Autowired
    DeptService service;

    @GetMapping(value = "/dept/list" )
    public List<Department> list(){

        return service.list();
    }

    @GetMapping(value = "/dept/get/{id}")
    public Department get(@PathVariable("id") Integer id){

        return service.get(id);
    }

    @PostMapping(value = "/dept/add")
    public boolean add(Department department){

        return service.add(department);
    }
}

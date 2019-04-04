package com.wangyong.cloud.controller;

import com.wangyong.cloud.entities.Department;
import com.wangyong.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gervard on 2019/3/27.
 */
@RestController
public class DeptController {

    @Autowired
    DeptService service;

    @GetMapping(value = "/feign/get/{id}")
    public Department get(@PathVariable("id") Integer id){

        return this.service.get(id);
    }
}

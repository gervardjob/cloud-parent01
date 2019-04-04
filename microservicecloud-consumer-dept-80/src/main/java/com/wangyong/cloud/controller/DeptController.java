package com.wangyong.cloud.controller;

import com.wangyong.cloud.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by gervard on 2019/3/27.
 */
@RestController
public class DeptController {

    private static final String SERVICE_URL_PREFIX="http://MICROSERVICECLOUD-DEPT";

    @Autowired
    RestTemplate restTemplate;
    @GetMapping(value = "/consumer/get/{id}")
    public Department get(@PathVariable("id") Integer id){
        return  restTemplate.getForObject(SERVICE_URL_PREFIX+"/dept/get/"+id,Department.class);
    }

    @GetMapping(value = "/consumer/list")
    public List<Department> list(){
        return restTemplate.getForObject(SERVICE_URL_PREFIX+"/dept/list",List.class);
    }
}

package com.wangyong.cloud.service;

import com.wangyong.cloud.entities.Department;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by gervard on 2019/3/27.
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory =DeptServiceFallbackFactory.class )
public interface DeptService {

    @GetMapping(value = "/dept/get/{id}")
    public Department get(@PathVariable("id") Integer id);

    @GetMapping(value="/dept/list")
    public List<Department> list();
}

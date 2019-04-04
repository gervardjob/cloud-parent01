package com.wangyong.cloud.service;

import com.wangyong.cloud.entities.Department;
import com.wangyong.cloud.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gervard on 2019/3/26.
 */
@Service
public class DeptService {
    @Autowired
    DeptMapper mapper;

    public List<Department> list(){

        return mapper.list();
    }

    public Department get(Integer id){

        return mapper.get(id);
    }

    public boolean add(Department department){
        return mapper.add(department);
    }
}

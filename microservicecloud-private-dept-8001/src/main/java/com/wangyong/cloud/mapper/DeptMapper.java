package com.wangyong.cloud.mapper;

import com.wangyong.cloud.entities.Department;

import java.util.List;

/**
 * Created by gervard on 2019/3/26.
 */
public interface DeptMapper {

    public Department get(Integer id);

    public List<Department> list();

    public boolean add(Department department);
}

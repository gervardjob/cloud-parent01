package com.wangyong.cloud.service;

import com.wangyong.cloud.entities.Department;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by gervard on 2019/4/1.
 */
@Component
public class DeptServiceFallbackFactory implements FallbackFactory<DeptService> {
    @Override
    public DeptService create(Throwable throwable) {
        return new DeptService() {
            @Override
            public Department get(Integer id) {
                return new Department(1,"异常部门","异常数据源");
            }

            @Override
            public List<Department> list() {
                return null;
            }
        };
    }
}

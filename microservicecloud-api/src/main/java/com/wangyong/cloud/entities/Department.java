package com.wangyong.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sun.rmi.server.InactiveGroupException;

/**
 * Created by gervard on 2019/3/26.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Department {
    private         Integer id;

    private         String dpt_name;

    private         String datasource;
}

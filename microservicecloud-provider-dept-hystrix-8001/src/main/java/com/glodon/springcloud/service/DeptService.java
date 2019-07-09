package com.glodon.springcloud.service;

import com.glodon.springcloud.entities.Dept;

import java.util.List;

/**
 * @author ：renc
 * @date ：Created in 2019/7/8 10:02
 * @description：${description}
 */
public interface DeptService {
    boolean add(Dept dept);
    Dept get(Long id);
    List<Dept> list();

}

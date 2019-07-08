package com.glodon.springcloud.dao;

import com.glodon.springcloud.entities.Dept;

import java.util.List;

/**
 * @author ：renc
 * @date ：Created in 2019/7/5 17:13
 * @description：${description}
 */
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();

}

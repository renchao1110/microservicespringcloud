package com.glodon.springcloud.service.impl;

import com.glodon.springcloud.dao.DeptDao;
import com.glodon.springcloud.entities.Dept;
import com.glodon.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：renc
 * @date ：Created in 2019/7/8 10:03
 * @description：${description}
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao;

    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }

}

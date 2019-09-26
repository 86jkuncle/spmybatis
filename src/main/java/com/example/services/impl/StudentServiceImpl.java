package com.example.services.impl;

import com.example.entity.Student;
import com.example.mapping.StudentMapper;
import com.example.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @date 2019/8/30 15:45
 */
@Service("studentServices")
public class StudentServiceImpl implements StudentServices {
    @Resource
    private StudentMapper studentMapper;
    @Override
    public int save(Student stu) {
        return studentMapper.add(stu);
    }

    @Override
    public int del(Integer id) {
        return studentMapper.deleteById(id);
    }

    @Override
    public int update(Student stu) {
        return studentMapper.update(stu);
    }

    @Override
    public Student query(Integer id) {
        return studentMapper.queryById(id);
    }

    @Override
    public Student queryByName(String name) {
        return studentMapper.queryByName(name);
    }

    @Override
    public int queryByIds(String[] ids) {
        return studentMapper.queryByIds(ids);
    }

}

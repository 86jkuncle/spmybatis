package com.example.services;

import com.example.entity.Student;

/**
 * @author Administrator
 * @date 2019/8/30 15:32
 */
public interface StudentServices {
    int save(Student stu);
    int del(Integer id);
    int update(Student stu);
    Student query(Integer id);
    Student queryByName(String name);
    int queryByIds(String[] ids);
}

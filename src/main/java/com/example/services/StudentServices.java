package com.example.services;

import com.example.entity.Student;

/**
 * @author Administrator
 * @date 2019/8/30 15:32
 */
public interface StudentServices {
    /**
     * 保存单个stu
     * @param stu
     * @return
     */
    int save(Student stu);

    /**
     * 删除单个stu
     * @param id
     * @return
     */
    int del(Integer id);

    /**
     * 更新学生信息
     * @param stu
     * @return
     */
    int update(Student stu);

    /**
     * 根据id查询stu
     * @param id
     * @return
     */
    Student query(Integer id);

    /**
     * 根据姓名查询stu
     * @param name
     * @return
     */
    Student queryByName(String name);

    /**
     * 查询某个范围的stu
     * @param ids
     * @return
     */
    int queryByIds(String[] ids);
}

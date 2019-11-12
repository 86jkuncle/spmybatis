package com.example.mapping;

import com.example.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 * @date 2019/8/30 15:30
 */
@Mapper
public interface StudentMapper {
    /**
     * 添加学生信息
     * @param student
     * @return
     */
    int add(Student student);

    /**
     * 根据学生编号删除
     * @param id
     * @return
     */
    int deleteById(Integer id);

    /**
     * 更新学生信息
     * @param student
     * @return
     */
    int update(Student student);

    /**
     * 根据学生id查询学生信息
     * @param id
     * @return
     */
    Student queryById(Integer id);

    /**
     * 根据学生姓名查询学生信息
     * @param sno
     * @return
     */
    Student queryByName(String sno);

    /**
     * 查询某个范围的学生个数
     * @param ids
     * @return
     */
    int queryByIds(@Param("ids") String[] ids);
}

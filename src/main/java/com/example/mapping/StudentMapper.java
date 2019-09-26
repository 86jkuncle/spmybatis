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
    int add(Student student);
    int deleteById(Integer id);
    int update(Student student);
    Student queryById(Integer id);
    Student queryByName(String sno);
    int queryByIds(@Param("ids") String[] ids);
}

package com.example.api;

import com.example.dto.StudentDTO;
import com.example.entity.Student;
import com.example.services.StudentServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Administrator
 * @date 2019/8/30 15:41
 */
@RestController
@RequestMapping("/v1/api/stu")
public class StudentApi {

    @Autowired
    private StudentServices studentServices;

    @RequestMapping(value = "query/{id}",method = RequestMethod.GET)
    public Student query(@PathVariable Integer id){
        return studentServices.query(id);
    }

    @RequestMapping(value = "del/{id}",method = RequestMethod.GET)
    public int del(@PathVariable Integer id){
        return studentServices.del(id);
    }

    @RequestMapping(value = "add",method = RequestMethod.GET)
    public int add(Student stu){
        return studentServices.save(stu);
    }

    @RequestMapping(value = "addStu")
    public int addStudent(@Valid StudentDTO studentDTO,BindingResult bindingResult){
        checkParam(studentDTO,bindingResult);
        Student stu = convert(studentDTO);
        return studentServices.save(stu);
    }

    @RequestMapping(value = "qurey/{sno}",method = RequestMethod.GET)
    public Student queryByName(@PathVariable String sno){
        return studentServices.queryByName(sno);
    }

    private void checkParam(StudentDTO studentDTO,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            List<ObjectError> errors = bindingResult.getAllErrors();
            StringBuilder stringBuilder = new StringBuilder();
            for(ObjectError error:errors){
                stringBuilder.append(error.getDefaultMessage());
            }

            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private Student convert(StudentDTO studentDTO){
        Student stu = new Student();
        BeanUtils.copyProperties(studentDTO,stu);
        return stu;
    }


    @RequestMapping(value = "udpate",method = RequestMethod.GET)
    public int update(Student stu){
        return studentServices.update(stu);
    }

    @RequestMapping(value = "ids")
    public int queryByIds(){
        String[] ids = {"1","20","3"};
        return studentServices.queryByIds(ids);
    }
}

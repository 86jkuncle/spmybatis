package com.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author Administrator
 * @date 2019/8/30 15:06
 */
@Alias(value = "Student")
@Getter
@Setter
@Accessors(chain = true)
public class Student implements Serializable {

    private Integer id;

    private String sno;

    private String sname;

    private String ssex;



}

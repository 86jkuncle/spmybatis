package com.example.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * @author Administrator
 * @date 2019/9/6 3:26
 */
@Getter
@Setter
public class StudentDTO {
    @NotNull(message = "学号不能为空")
    private String sno;

    @NotNull(message = "姓名不能为空")
    private String sname;

    @NotNull(message = "性别不能为空")
    private String ssex;
}

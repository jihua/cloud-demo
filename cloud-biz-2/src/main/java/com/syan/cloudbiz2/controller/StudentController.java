package com.syan.cloudbiz2.controller;

/**
 * @author Syan
 * @date 2021/3/31
 */

import com.syan.cloudbiz2.entity.StudentEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  <p>
 *      学生模块，控制器
 *  </p>
 * */
@RestController
@RequestMapping(value = "/student")
public class StudentController {

    /**
     * 获取一个学生
     * @return JSON对象
     */
    @GetMapping(value = "/detail")
    public Object getStudent () {
        StudentEntity student = new StudentEntity();
        student.setName("李四");
        student.setAge(22);
        return student;
    }
}

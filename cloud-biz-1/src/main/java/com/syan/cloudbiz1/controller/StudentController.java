package com.syan.cloudbiz1.controller;

/**
 * @author Syan
 * @date 2021/3/31
 */

import com.syan.cloudbiz1.entity.StudentEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

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
    public Object getStudent () throws InterruptedException {
        TimeUnit.SECONDS.sleep(6);
        StudentEntity student = new StudentEntity();
        student.setName("张三");
        student.setAge(18);
        return student;
    }
}

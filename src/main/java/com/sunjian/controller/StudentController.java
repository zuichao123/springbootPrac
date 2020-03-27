package com.sunjian.controller;

import com.sunjian.entity.Student;
import com.sunjian.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sunjian
 * @date 2020/3/27 22:36
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/findById/{id}")
    @ResponseBody
    public Student findById(@PathVariable("id") Integer id){
        return studentService.findById(id);
    }
}

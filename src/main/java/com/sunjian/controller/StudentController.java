package com.sunjian.controller;

import com.sunjian.entity.Student;
import com.sunjian.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author sunjian
 * @date 2020/3/27 22:36
 */
@RestController
public class StudentController {
//    @Autowired
//    private StudentService studentService;
//
//    @RequestMapping("/findById/{id}")
//    @ResponseBody
//    public Student findById(@PathVariable("id") Integer id) {
//        return studentService.findById(id);
//    }

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 增加、修改
     * @param student
     */
    @PostMapping("/set")
    public void set(@RequestBody Student student) {
        redisTemplate.opsForValue().set("stu", student);
    }

    /**
     * 查找
     * @param key
     * @return
     */
    @GetMapping("/get/{key}")
    public Student get(@PathVariable("key") String key){
        Student student = (Student) redisTemplate.opsForValue().get(key);
        return student;
    }

    /**
     * 删除
     * @param key
     * @return
     */
    @GetMapping("/delete/{key}")
    public boolean delete(@PathVariable("key") String key){
        redisTemplate.delete(key);
        return redisTemplate.hasKey(key);
    }
}

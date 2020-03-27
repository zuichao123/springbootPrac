package com.sunjian.service.impl;

import com.sunjian.entity.Student;
import com.sunjian.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author sunjian
 * @date 2020/3/27 22:33
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public Student findById(Integer id) {
        return jdbcTemplate.queryForObject("select * from student where id = ?", new Object[]{id}, new BeanPropertyRowMapper<Student>(Student.class));
    }
}

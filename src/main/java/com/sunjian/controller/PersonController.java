package com.sunjian.controller;

import com.sunjian.entity.Person;
import com.sunjian.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunjian
 * @date 2020/3/24 23:32
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServiceImpl personServiceImpl;

    @GetMapping("/findById/{id}")
    public Person findById(@PathVariable("id") Integer id){
        Person person = personServiceImpl.findById(id);
        System.out.println(person);
        return person;
    }
}

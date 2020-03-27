package com.sunjian.service.impl;

import com.sunjian.dao.PersonDao;
import com.sunjian.entity.Person;
import com.sunjian.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sunjian
 * @date 2020/3/24 23:30
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDao personDao;

    public Person findById(Integer id){
        return personDao.findById(id);
    }
}

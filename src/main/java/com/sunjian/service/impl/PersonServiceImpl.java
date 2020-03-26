package com.sunjian.service.impl;

import com.sunjian.dao.UserDao;
import com.sunjian.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sunjian
 * @date 2020/3/24 23:30
 */
@Service
public class PersonServiceImpl {
    @Autowired
    private UserDao userDao;

    public Person findById(Integer id){
        return userDao.findById(id);
    }
}

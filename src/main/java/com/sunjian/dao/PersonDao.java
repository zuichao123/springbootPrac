package com.sunjian.dao;

import com.sunjian.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author sunjian
 * @date 2020/3/24 23:25
 */
@Mapper
public interface PersonDao {
    @Select("select * from person where id = #{id}")
    Person findById(Integer id);
}

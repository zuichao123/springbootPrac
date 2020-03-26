package com.sunjian.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.sunjian.entity.Person;
import com.sunjian.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @author sunjian
 * @date 2020/3/25 0:33
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/index")
    public String index() {
        System.out.println("hello...");
        return "index";
    }

    @RequestMapping("/index2")
    public ModelAndView index2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("num", 30);
        return modelAndView;
    }

    @RequestMapping("/login")
    public void login() {
        System.out.println("login");
    }

    @GetMapping("/each")
    public ModelAndView each() {
        List<User> list = new ArrayList<>();
        list.add(new User(2, "zj", 33, 1));
        list.add(new User(3, "zj2", 32, 0));
        list.add(new User(1, "zj3", 31, 1));

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

    @GetMapping("/utility")
    public ModelAndView utility(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("date",new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019,1,1);
        modelAndView.addObject("calendar",calendar);
        modelAndView.addObject("number",0.06);
        modelAndView.addObject("string","Spring Boot");
        modelAndView.addObject("boolean",true);
        modelAndView.addObject("array", Arrays.asList("张三","李四","王五"));
        List<User> list = new ArrayList<>();
        list.add(new User(1,"张三",1,1));
        list.add(new User(2,"李四",0,1));
        list.add(new User(3,"王五",1,0));
        modelAndView.addObject("list",list);
        Set<User> set = new HashSet<>();
        set.add(new User(1,"张三",1,0));
        set.add(new User(2,"李四",0,1));
        set.add(new User(3,"王五",1,1));
        modelAndView.addObject("set",set);
        Map<Long,User> map = new HashMap<>();
        map.put(1L,new User(1,"张三",1,0));
        map.put(2L,new User(2,"李四",0,1));
        map.put(3L,new User(3,"王五",1,1));
        modelAndView.addObject("map",map);
        return modelAndView;
    }
}

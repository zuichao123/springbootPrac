package com.sunjian.controller;

import com.sunjian.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author sunjian
 * @date 2020/3/25 0:33
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/index")
    public String index(){
        System.out.println("hello...");
        return "index";
    }

    @RequestMapping("/index2")
    public ModelAndView index2(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("num", 30);
        return modelAndView;
    }

}

package com.xalo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther:
 * @Date: 2019/8/15 09:33
 * @Description:
 */

@Controller
public class MyController {
    @GetMapping("/first")
    public ModelAndView first(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title","我是后台过来的title");
        modelAndView.addObject("color","green");
        modelAndView.addObject("height","400px");
        modelAndView.addObject("sex","女");

        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"aa"));
        students.add(new Student(2,"bb"));
        modelAndView.addObject("students",students);
        Map<String ,Object> map = new HashMap<>();
        map.put("title","<静夜思>");
        map.put("first","啊打发手动阀撒");
        map.put("second","古风格梵蒂冈发");
        modelAndView.addObject("map",map);



        modelAndView.setViewName("Thymeleaf");
        return modelAndView;
    }
}

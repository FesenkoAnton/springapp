package com.infopulse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping(value = "/index.jsp", method = RequestMethod.GET)
    public ModelAndView showIndex() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        mav.addObject("welcome", "Hello, world");
        return mav;
    }
}
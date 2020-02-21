package com.nick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PagesController {

    @RequestMapping("/{pages}")
    public String pages(@PathVariable String pages){
        return pages;
    }

}

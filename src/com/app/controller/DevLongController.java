package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DevLongController {

    @RequestMapping(value = "/dev/login")
    public String devLogin(){
        return "devlogin";
    }

    @RequestMapping(value = "dologin",method = RequestMethod.POST)
    public String dologin(HttpServletRequest request, @RequestParam String devCode,@RequestParam String){
        if ()
    }
}

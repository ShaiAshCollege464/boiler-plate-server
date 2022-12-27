package com.dev.controllers;

import com.dev.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
public class TestController {

    @Autowired
    public Utils utils;

    @PostConstruct
    public void init () {
    }


    @RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
    public Object test () {
        return "Hello From Server";
    }




}

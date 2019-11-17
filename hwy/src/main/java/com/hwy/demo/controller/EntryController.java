package com.hwy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @Description: 页面跳转的控制类
* @Author: 陈开源
* @Date: 2019/11/14
*/

@Controller
public class EntryController {

    @RequestMapping("/index")
    public String entryIndex() {
        return "index";
    }

    @RequestMapping("/login")
    public String entryLogin() {
        return "login";
    }

    @RequestMapping("/newsList")
    public String entryNewsList() {
        return "newsList";
    }

    @RequestMapping("/releaseNews")
    public String entryReaseNews() {
        return "releaseNews";
    }

    @RequestMapping("/ceshi")
    public String entryCeshi() {
        return "ueditor/ceshi";
    }
}

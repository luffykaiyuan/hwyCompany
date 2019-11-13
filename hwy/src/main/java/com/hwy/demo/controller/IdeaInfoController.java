package com.hwy.demo.controller;

import com.hwy.demo.po.IdeaInfoPo;
import com.hwy.demo.service.IdeaInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("/idea")
public class IdeaInfoController {

    @Autowired
    IdeaInfoService ideaInfoService;

    @PostMapping(value = "/insertIdea", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String insertIdea(@RequestBody IdeaInfoPo ideaInfoPo){
        ideaInfoService.insertIdea(ideaInfoPo);
        return "success";
    }
}

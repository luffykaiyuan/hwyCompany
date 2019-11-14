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

/** 
* @Description: 意见提出的控制类
* @Author: 陈开源
* @Date: 2019/11/14 
*/

@Controller
@RequestMapping("/idea")
public class IdeaInfoController {

    @Autowired
    IdeaInfoService ideaInfoService;

    /** 
    * @Description: 新增意见 
    * @Param: [ideaInfoPo] 
    * @return: java.lang.String 
    * @Author: 陈开源
    * @Date: 2019/11/14 
    */
    @PostMapping(value = "/insertIdea", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String insertIdea(@RequestBody IdeaInfoPo ideaInfoPo) throws Exception {
        ideaInfoService.insertIdea(ideaInfoPo);
        return "success";
    }
}

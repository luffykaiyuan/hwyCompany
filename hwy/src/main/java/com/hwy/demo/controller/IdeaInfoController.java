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

import java.util.List;
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

    /** 
    * @Description: 查询所有意见 
    * @Param: [] 
    * @return: java.util.List<com.hwy.demo.po.IdeaInfoPo> 
    * @Author: 陈开源
    * @Date: 2019/11/28 
    */
    @PostMapping(value = "/selectAllIdea", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<IdeaInfoPo> selectAllIdea(){
        return ideaInfoService.selectAllIdea();
    }

    /** 
    * @Description: 逻辑删除意见 
    * @Param: [ideaInfoPo] 
    * @return: int 
    * @Author: 陈开源
    * @Date: 2019/11/28 
    */
    @PostMapping(value = "/deleteIdea", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public int deleteIdea(@RequestBody IdeaInfoPo ideaInfoPo){
        return ideaInfoService.updateByPrimaryKeySelective(ideaInfoPo);
    }
}

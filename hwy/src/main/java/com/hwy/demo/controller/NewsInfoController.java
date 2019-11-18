package com.hwy.demo.controller;

import com.hwy.demo.po.NewsInfoPo;
import com.hwy.demo.service.NewsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/news")
public class NewsInfoController {

    @Autowired
    NewsInfoService newsInfoService;

    /**
    * @Description: 新增新闻
    * @Param: [newsInfoPo]
    * @return: void
    * @Author: 陈开源
    * @Date: 2019/11/18
    */
    @RequestMapping("/insertNews")
    @ResponseBody
    public String insertSelective(@RequestBody NewsInfoPo newsInfoPo){
        newsInfoService.insertSelective(newsInfoPo);
        return "成功新增一个新闻信息";
    }

    /**
    * @Description: 逻辑删除新闻，0为默认，1为删除
    * @Param: [newsInfoPo]
    * @return: void
    * @Author: 陈开源
    * @Date: 2019/11/18
    */
    @RequestMapping("/deleteNews")
    @ResponseBody
    public String deleteNews(@RequestBody NewsInfoPo newsInfoPo){
        newsInfoService.updateByPrimaryKeySelective(newsInfoPo);
        return "删除新闻成功";
    }

    /**
    * @Description: 获取所有未被删除的新闻
    * @Param: []
    * @return: java.util.List<com.hwy.demo.po.NewsInfoPo>
    * @Author: 陈开源
    * @Date: 2019/11/18
    */
    @RequestMapping("/selectAllNews")
    @ResponseBody
    public List<NewsInfoPo> selectAllNews(){
        return newsInfoService.selectAllNews();
    }
}

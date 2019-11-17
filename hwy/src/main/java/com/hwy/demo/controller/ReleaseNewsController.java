package com.hwy.demo.controller;

import com.hwy.demo.po.ImgInfo;
import com.hwy.demo.service.ReleaseNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;

@Controller
@RequestMapping("/img")
public class ReleaseNewsController {

    @Autowired
    ReleaseNewsService releaseNewsService;

    /** 
    * @Description: 上传图片 
    * @Param: [file, response] 
    * @return: com.hwy.demo.po.ImgInfo 
    * @Author: 陈开源
    * @Date: 2019/11/17 
    */
    @RequestMapping("/upload")
    @ResponseBody
    public ImgInfo setImgUrl(@RequestParam("imgFile") MultipartFile file, HttpServletResponse response)
            throws Exception {
        return releaseNewsService.setImgUrl(file, response);
    }
}

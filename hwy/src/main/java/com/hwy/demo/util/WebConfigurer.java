package com.hwy.demo.util;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
* @Description: 新增一个根目录，用于文件上传回显的位置
* @Param:
* @return:
* @Author: 陈开源
* @Date: 2019/11/17
*/
@SpringBootConfiguration
public class WebConfigurer implements WebMvcConfigurer {

    @Value("${uploadPath}")
    String getPath;

    //拦截器省略
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/img/**").addResourceLocations("file:" + getPath);
    }

}

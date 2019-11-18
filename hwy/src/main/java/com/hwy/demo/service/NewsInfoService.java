package com.hwy.demo.service;

import com.hwy.demo.dao.NewsInfoPoMapper;
import com.hwy.demo.po.NewsInfoPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class NewsInfoService {

    @Autowired
    NewsInfoPoMapper newsInfoPoMapper;

    public void insertSelective(NewsInfoPo newsInfoPo){
        String uid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        newsInfoPo.setId(uid);
        newsInfoPo.setAddTime(getStringDate());
        newsInfoPo.setDeleteStatus("0");
        newsInfoPoMapper.insertSelective(newsInfoPo);
    }

    public List<NewsInfoPo> selectAllNews(){
        return newsInfoPoMapper.selectAllNews();
    }

    public void updateByPrimaryKeySelective(NewsInfoPo newsInfoPo){
        newsInfoPo.setDeleteStatus("1");
        newsInfoPoMapper.updateByPrimaryKeySelective(newsInfoPo);
    }

    //获取字符串类型的当前时间
    public String getStringDate() {
        Date date = new Date();
        SimpleDateFormat sdf
                = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
}

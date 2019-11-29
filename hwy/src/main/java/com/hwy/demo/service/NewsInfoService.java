package com.hwy.demo.service;

import com.hwy.demo.dao.NewsInfoPoMapper;
import com.hwy.demo.po.NewsInfoPo;
import com.hwy.demo.util.GetNowDate;
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
        newsInfoPo.setAddTime(GetNowDate.getStringDate());
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

    public NewsInfoPo selectByPrimaryKey(String id){
        return newsInfoPoMapper.selectByPrimaryKey(id);
    }

    public int updateNews(NewsInfoPo newsInfoPo){
        return newsInfoPoMapper.updateByPrimaryKeySelective(newsInfoPo);
    }
}

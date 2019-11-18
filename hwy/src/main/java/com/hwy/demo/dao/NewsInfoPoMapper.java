package com.hwy.demo.dao;

import com.hwy.demo.po.NewsInfoPo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface NewsInfoPoMapper {
    int deleteByPrimaryKey(String id);

    int insert(NewsInfoPo record);

    int insertSelective(NewsInfoPo record);

    NewsInfoPo selectByPrimaryKey(String id);

    List<NewsInfoPo> selectAllNews();

    int updateByPrimaryKeySelective(NewsInfoPo record);

    int updateByPrimaryKey(NewsInfoPo record);
}
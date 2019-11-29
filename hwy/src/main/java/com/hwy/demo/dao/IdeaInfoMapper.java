package com.hwy.demo.dao;

import com.hwy.demo.po.IdeaInfoPo;
import com.hwy.demo.po.NewsInfoPo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface IdeaInfoMapper {
    int insert(IdeaInfoPo record);

    List<IdeaInfoPo> selectAllIdea();

    int insertSelective(IdeaInfoPo record);

    int updateByPrimaryKeySelective(IdeaInfoPo record);
}
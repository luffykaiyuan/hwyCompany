package com.hwy.demo.dao;

import com.hwy.demo.po.IdeaInfoPo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface IdeaInfoMapper {
    int insert(IdeaInfoPo record);

    int insertSelective(IdeaInfoPo record);
}
package com.hwy.demo.service;

import com.hwy.demo.dao.IdeaInfoMapper;
import com.hwy.demo.po.IdeaInfoPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class IdeaInfoService {

    @Autowired
    IdeaInfoMapper ideaInfoMapper;

    public void insertIdea(IdeaInfoPo ideaInfoPo) {
        String uid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        ideaInfoPo.setId(uid);
        ideaInfoMapper.insert(ideaInfoPo);
    }
}

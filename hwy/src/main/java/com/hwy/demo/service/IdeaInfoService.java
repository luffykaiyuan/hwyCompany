package com.hwy.demo.service;

import com.hwy.demo.dao.IdeaInfoMapper;
import com.hwy.demo.po.IdeaInfoPo;
import com.hwy.demo.util.SendMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class IdeaInfoService {

    @Autowired
    IdeaInfoMapper ideaInfoMapper;

    public void insertIdea(IdeaInfoPo ideaInfoPo) throws Exception {
        //发送邮件
        SendMail.send(ideaInfoPo.getPersonName(), ideaInfoPo.getContactInfo(), ideaInfoPo.getContent());
        //生成32位的随机数作为主键ID
        //String uid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        //ideaInfoPo.setId(uid);
        //ideaInfoMapper.insert(ideaInfoPo);
    }
}

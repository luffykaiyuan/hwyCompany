package com.hwy.demo.controller;

import com.hwy.demo.po.LoginPo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Value("${sys.username}")
    String username;

    @Value("${sys.pass}")
    String password;

    /**
    * @Description: 登录实现，账号密码都为admin
    * @Param: [username, password, request]
    * @return: java.lang.String
    * @Author: 陈开源
    * @Date: 2019/11/14
    */
    @PostMapping("/doLogin")
    @ResponseBody
    public String doLogin(@RequestBody LoginPo loginPo, HttpServletRequest request) {
        if (username.equals(loginPo.getUsername()) && password.equals(loginPo.getPassword())) {
            HttpSession session = request.getSession();
            session.setAttribute("name", loginPo.getUsername());
            return "releaseNews";
        } else {
            return "login";
        }
    }
}

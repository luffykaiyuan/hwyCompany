package com.hwy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    /**
    * @Description: 登录实现，账号密码都为admin
    * @Param: [username, password, request]
    * @return: java.lang.String
    * @Author: 陈开源
    * @Date: 2019/11/14
    */
    @PostMapping("/doLogin")
    public String doLogin(@RequestParam("username") String username,
                            @RequestParam("password") String password, HttpServletRequest request) {
        if ("admin".equals(username) && "admin".equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("name", username);
            return "releaseNews";
        } else {
            return "login";
        }
    }
}

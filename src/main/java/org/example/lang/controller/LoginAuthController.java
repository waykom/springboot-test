package org.example.lang.controller;


import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import org.example.lang.bean.Response;
import org.example.lang.bean.User;
import org.example.lang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/honglang")
public class LoginAuthController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public Response doLogin(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        User userByName = userService.getUserByName(username);
        if (username == null || password == null) {
            return Response.error("请输入正确的账户或密码");
        }
        if (userByName.getPassword().equals(password)) {
            Integer userId = userByName.getUserId();
            StpUtil.login(userId);
            SaTokenInfo tokenInfo = StpUtil.getTokenInfo();
            HashMap<String, String> map = new HashMap<>();
            map.put("token", tokenInfo.getTokenValue());
            return Response.ok("登录成功", map);
        }
        return Response.error("登录失败");
    }

    @PostMapping("/isLogin")
    public Response isLogin() {
        boolean login = StpUtil.isLogin();
        return Response.ok("当前客户端是否登录：" + login);
    }

    @PostMapping("/logout")
    public Response logout() {
        StpUtil.logout();

        return Response.ok("退出登录成功");
    }
}

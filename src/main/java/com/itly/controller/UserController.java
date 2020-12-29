package com.itly.controller;

import com.itly.pojo.UserVo;
import com.itly.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userservice;

    @RequestMapping("/insert")
    @ResponseBody
    public Map insertUser(UserVo uservo, @RequestParam String file) {
        String end = uservo.getUserName() + file.substring(file.lastIndexOf("."));
        uservo.setFaceImage(end);
        int flag = userservice.insert(uservo);
        Map map = new HashMap();
        if (flag != 0) {
            map.put("msg", flag);
        } else {
            map.put("msg", flag);
        }
        return map;
    }

    @RequestMapping("/queryById")
    @ResponseBody
    public Map queryUserById(int userId) {
        System.out.println(userId);
        Map map = new HashMap();
        if (userId != 0){
            UserVo uservo = userservice.queryById(userId);
            map.put("msg", uservo.getUserFullName());
        }else{
            map.put("msg","未执行");
        }
        return map;
    }

    @RequestMapping("/queryAll")
    @ResponseBody
    public Map queryAll(int page, int limit, UserVo uservo) {
        System.out.println("搜索的值:" + uservo);
        PageInfo<UserVo> list = userservice.queryAll(page, limit, uservo);
        for (UserVo u : list.getList()) {
            System.out.println(u);
        }
        Map map = new HashMap();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", list.getTotal());
        map.put("data", list.getList());
        return map;
    }

    @RequestMapping("/update")
    @ResponseBody
    public Map updateUser(UserVo uservo) {
        int flag = userservice.update(uservo);
        Map map = new HashMap();
        if (flag != 0) {
            map.put("msg", flag);
        } else {
            map.put("msg", flag);
        }
        return map;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Map deleteUser(@RequestBody List<UserVo> list) {
        int flag = userservice.delete(list);
        Map map = new HashMap();
        if (flag != 0) {
            map.put("msg", 1);
        } else {
            map.put("msg", 0);
        }
        return map;
    }

    @RequestMapping("/checkByName")
    @ResponseBody
    public Map checkUserByName(UserVo uservo, HttpSession session) {
        UserVo flag = userservice.checkByName(uservo);
        System.out.println(flag);
        Map map = new HashMap();
        if (flag != null) {
            session.setAttribute("user",flag);
            map.put("msg", 1);
        } else {
            map.put("msg", 0);
        }
        return map;
    }

    @RequestMapping("/upload")
    @ResponseBody
    public Map upload(@RequestParam("file") MultipartFile file, String userName) {
        Map map = new HashMap();
        // 存储地址
        //映射路径存储
        String realPath = "C:\\Users\\Administrator\\Desktop\\cxj";
        String newFilename = userName + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        // 上传图片
        try {
            file.transferTo(new File(realPath, newFilename));
        } catch (IOException e) {
            e.printStackTrace();
            map.put("msg", "0");
        }
        map.put("msg", "1");
        return map;
    }
}

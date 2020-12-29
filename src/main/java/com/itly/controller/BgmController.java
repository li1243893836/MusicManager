package com.itly.controller;

import com.itly.pojo.BgmVo;
import com.itly.pojo.UserVo;
import com.itly.service.BgmService;
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
@RequestMapping("/bgm")
public class BgmController {
    @Autowired
    private BgmService bgmservice;

    @RequestMapping("/insert")
    @ResponseBody
    public Map insertUser(BgmVo bgmvo, @RequestParam String file, HttpSession session){
        UserVo uservo = (UserVo) session.getAttribute("user");
        String end = file.substring(file.lastIndexOf("."));
        bgmvo.setBgmId(uservo.getUserId());
        bgmvo.setBgmPath(end);
        int flag = bgmservice.insert(bgmvo);
        Map map = new HashMap();
        if(flag != 0){
            map.put("msg",flag);
        }else {
            map.put("msg",flag);
        }
        return map;
    }

    @RequestMapping("/queryAll")
    @ResponseBody
    public Map queryAll(int page, int limit, BgmVo bgmvo){
        PageInfo<BgmVo> list = bgmservice.queryAll(page, limit, bgmvo);
        Map map = new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",list.getTotal());
        map.put("data",list.getList());
        return map;
    }
    @RequestMapping("/delete")
    @ResponseBody
    public Map deleteUser(@RequestBody List<BgmVo> list){
        int flag = bgmservice.delete(list);
        Map map = new HashMap();
        if (flag != 0){
            map.put("msg",1);
        }else{
            map.put("msg",0);
        }
        return map;
    }
    @RequestMapping("/upload")
    @ResponseBody
    public Map upload(@RequestParam("file") MultipartFile file, String bgmName){
        Map map = new HashMap();
        // 存储地址
        //映射路径存储
        String realPath = "C:\\Users\\Administrator\\Desktop\\cxj";
        String newFilename = bgmName + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        // 上传歌曲
        try {
            file.transferTo(new File(realPath,newFilename));
        } catch (IOException e) {
            e.printStackTrace();
            map.put("msg", "0");
        }
        map.put("msg", "1");
        return map;
    }
}

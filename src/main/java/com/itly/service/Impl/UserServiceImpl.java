package com.itly.service.Impl;

import com.itly.mapper.UserMapper;
import com.itly.pojo.UserVo;
import com.itly.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper dao;
    @Override
    public int insert(UserVo uservo) {
        return dao.insert(uservo);
    }

    @Override
    public int delete(List<UserVo> list) {
        return dao.delete(list);
    }

    @Override
    public int update(UserVo uservo) {
        return dao.update(uservo);
    }

    @Override
    public UserVo queryById(int userId) {
        return dao.queryById(userId);
    }

    @Override
    public PageInfo<UserVo> queryAll(int page ,int limit,UserVo uservo) {
        PageHelper.startPage(page, limit);
        List<UserVo> list = dao.queryAll(uservo);
        PageInfo<UserVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public UserVo checkByName(UserVo uservo) {
        return dao.checkByName(uservo);
    }

}

package com.itly.mapper;

import com.itly.pojo.UserVo;

import java.util.List;

public interface UserMapper {
    //增加
    public int insert(UserVo uservo);
    //删除
    public int delete(List<UserVo> list);
    //修改
    public int update(UserVo uservo);
    //查询一条记录
    public UserVo queryById(int userId);
    //查询所有记录
    public List<UserVo> queryAll(UserVo uservo);

    public UserVo checkByName(UserVo uservo);
}

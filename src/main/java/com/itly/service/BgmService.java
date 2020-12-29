package com.itly.service;

import com.itly.pojo.BgmVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface BgmService {
    //增
    public int insert(BgmVo bgmvo);
    //查询
    public PageInfo<BgmVo> queryAll(int page, int limit, BgmVo bgmvo);
    //删除
    public int delete(List<BgmVo> list);
}

package com.itly.mapper;

import com.itly.pojo.BgmVo;

import java.util.List;

public interface BgmMapper {
    //增加
    public int insert(BgmVo bgmvo);

    //删除
    public int delete(List<BgmVo> list);
    //查询
    public List<BgmVo> queryAll(BgmVo bgmvo);
}

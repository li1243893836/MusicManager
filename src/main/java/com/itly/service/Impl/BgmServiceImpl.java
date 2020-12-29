package com.itly.service.Impl;


import com.itly.mapper.BgmMapper;
import com.itly.pojo.BgmVo;
import com.itly.service.BgmService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BgmServiceImpl implements BgmService {
    @Autowired
    private BgmMapper dao;
    @Override
    public int insert(BgmVo bgmvo) {
        return dao.insert(bgmvo);
    }

    @Override
    public PageInfo<BgmVo> queryAll(int page, int limit, BgmVo bgmvo) {
        PageHelper.startPage(page,limit);
        List<BgmVo> list = dao.queryAll(bgmvo);
        PageInfo<BgmVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public int delete(List<BgmVo> list) {
        return dao.delete(list);
    }
}

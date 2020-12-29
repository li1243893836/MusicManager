package com.itly.service.Impl;

import com.itly.mapper.FilmMapper;
import com.itly.pojo.FilmVo;
import com.itly.service.FilmService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmMapper dao;

    @Override
    public int insert(FilmVo filmvo) {
        return dao.insert(filmvo);
    }

    @Override
    public PageInfo<FilmVo> queryAll(int page, int limit, FilmVo filmvo) {
        PageHelper.startPage(page,limit);
        List<FilmVo> list = dao.queryAll(filmvo);
        PageInfo<FilmVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public int delete(List<FilmVo> list) {
        return dao.delete(list);
    }
}

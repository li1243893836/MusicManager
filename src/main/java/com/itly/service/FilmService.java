package com.itly.service;

import com.itly.pojo.FilmVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface FilmService {
    //增
    public int insert(FilmVo filmvo);
    //查询
    public PageInfo<FilmVo> queryAll(int page, int limit, FilmVo filmvo);
    //删除
    public int delete(List<FilmVo> list);
}

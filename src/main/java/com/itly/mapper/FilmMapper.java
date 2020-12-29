package com.itly.mapper;

import com.itly.pojo.FilmVo;

import java.util.List;

public interface FilmMapper {
    //增加
    public int insert(FilmVo filmvo);

    //删除
    public int delete(List<FilmVo> list);
    //查询
    public List<FilmVo> queryAll(FilmVo filmvo);
}

package com.itly.controller;


import com.github.pagehelper.PageInfo;
import com.itly.pojo.BgmVo;
import com.itly.service.BgmService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class BgmControllerTest {
    private final static Logger logger = LoggerFactory.getLogger(BgmControllerTest.class);

    @InjectMocks
    BgmController bgmController;

    @Mock
    private BgmService bgmservice;

    private MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(bgmController).build();
    }

    @Test
    public void queryAll() throws Exception{
        try {
            int page = 1;
            int limit = 2;
            BgmVo bgmvo = new BgmVo();
            bgmvo.setBgmId(1);
            bgmvo.setBgmPath("123");
            PageInfo<BgmVo> list = new PageInfo<BgmVo>();
            list.setTotal(1L);
            list.setList(new ArrayList<BgmVo>());
            when(bgmservice.queryAll(any(Integer.class),any(Integer.class),any(BgmVo.class))).thenReturn(list);
            bgmController.queryAll(page,limit,bgmvo);
        }catch (Exception e){
            logger.error("queryAll error",e);
        }
    }

}

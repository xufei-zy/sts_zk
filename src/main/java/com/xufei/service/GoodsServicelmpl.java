package com.xufei.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xufei.mapper.GoodsMapperDao;

@Service
public class GoodsServicelmpl implements GoodsService{

	@Resource
	private GoodsMapperDao goodsMapperDao;
}

package com.xufei.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.xufei.service.GoodsService;

@Controller
public class GoodsController {

	@Resource
	private GoodsService goodsService;
	
	
}

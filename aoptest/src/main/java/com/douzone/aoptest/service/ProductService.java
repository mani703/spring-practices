package com.douzone.aoptest.service;

import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.stereotype.Service;

import com.douzone.aoptest.vo.ProductVo;

@Service
public class ProductService {

	public ProductVo find(String name) {
		
		System.out.println("[ProductService] finding....");
//		if(1-1 == 0) {	// @AfterThrowing
//			throw new RuntimeException("Find Exception");
//		}
		return new ProductVo(name);
	}

}

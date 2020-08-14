package com.web.DiliFresh.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.DiliFresh.model.bean.Product;
import com.web.DiliFresh.model.mapper.ProductMapper;

@Service
public class ProductService {
	
	@Autowired
	private ProductMapper productMapper;
	
	public Product selectProductInfo(int productid) {
		// TODO Auto-generated method stub
		return productMapper.selectProductInfo(productid);
	}

}

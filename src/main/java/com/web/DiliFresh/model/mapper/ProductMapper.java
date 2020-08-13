package com.web.DiliFresh.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.web.DiliFresh.model.bean.Product;

@Mapper
public interface ProductMapper {

	
	List<Product> selectAll();
	Product selectProductInfo(int productid);

}

package com.web.DiliFresh.model.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.web.DiliFresh.model.bean.Product;

@Mapper
public interface ProductMapper {

	Product selectProductInfo(int productid);

}

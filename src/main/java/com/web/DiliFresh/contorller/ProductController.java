package com.web.DiliFresh.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.DiliFresh.model.bean.Product;
import com.web.DiliFresh.model.service.ProductService;

@CrossOrigin
@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("selectProductInfo/{productid}")
	public Product selectProductInfo(@PathVariable int productid) {
		
		return productService.selectProductInfo(productid);
		
	}
}

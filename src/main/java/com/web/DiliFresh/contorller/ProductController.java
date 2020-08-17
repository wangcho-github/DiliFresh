package com.web.DiliFresh.contorller;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

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

	@RequestMapping("/selectAll")
	public List<Product> selectAll(){
	
		List<Product> list = new ArrayList<Product>(); 
		
		list = productService.selectAll();
		System.out.println(list);
		
		return list;
		
	}
=======
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
>>>>>>> branch 'master' of https://github.com/wangcho-github/DiliFresh
	
	@RequestMapping("selectProductInfo/{productid}")
	public Product selectProductInfo(@PathVariable int productid) {
		
		return productService.selectProductInfo(productid);
		
	}
}

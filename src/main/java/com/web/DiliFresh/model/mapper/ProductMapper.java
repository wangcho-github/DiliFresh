package com.web.DiliFresh.model.mapper;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> branch 'master' of https://github.com/wangcho-github/DiliFresh
import org.apache.ibatis.annotations.Mapper;

import com.web.DiliFresh.model.bean.Product;

@Mapper
public interface ProductMapper {

<<<<<<< HEAD
	
	List<Product> selectAll();
=======
>>>>>>> branch 'master' of https://github.com/wangcho-github/DiliFresh
	Product selectProductInfo(int productid);

}

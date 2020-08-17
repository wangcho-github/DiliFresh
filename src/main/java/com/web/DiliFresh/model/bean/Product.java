package com.web.DiliFresh.model.bean;

<<<<<<< HEAD
public class Product {
		private int productid;
		private String productname;
		private int price;
		private String pimg;
		private String weight;
		private int limitcount;
		private int quantity;
		private int freshdate;
		private String brand;
		private String makeaddress;
		private int hot;
		private Shop shop;
		private Productkind produckind;
		
		public int getHot() {
			return hot;
		}
		public void setHot(int hot) {
			this.hot = hot;
		}
		public int getProductid() {
			return productid;
		}
		public void setProductid(int productid) {
			this.productid = productid;
		}
		public String getProductname() {
			return productname;
		}
		public void setProductname(String productname) {
			this.productname = productname;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getPimg() {
			return pimg;
		}
		public void setPimg(String pimg) {
			this.pimg = pimg;
		}
		public String getWeight() {
			return weight;
		}
		public void setWeight(String weight) {
			this.weight = weight;
		}
		public int getLimitcount() {
			return limitcount;
		}
		public void setLimitcount(int limitcount) {
			this.limitcount = limitcount;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public int getFreshdate() {
			return freshdate;
		}
		public void setFreshdate(int freshdate) {
			this.freshdate = freshdate;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getMakeaddress() {
			return makeaddress;
		}
		public void setMakeaddress(String makeaddress) {
			this.makeaddress = makeaddress;
		}
		public Shop getShop() {
			return shop;
		}
		public void setShop(Shop shop) {
			this.shop = shop;
		}
		public Productkind getProduckind() {
			return produckind;
		}
		public void setProduckind(Productkind produckind) {
			this.produckind = produckind;
		}
		
=======
import java.sql.Date;

public class Product {

	private int productid;
	private String productname;
	private double price;
	private String pimg;
	private String weight;
	private int limitcount;
	private int quantity;
	private String brand;
	private String makeaddress;
	private int freshdate;
	private int shopid;
	private int kindid;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPimg() {
		return pimg;
	}
	public void setPimg(String pimg) {
		this.pimg = pimg;
	}
	
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public int getLimitcount() {
		return limitcount;
	}
	public void setLimitcount(int limitcount) {
		this.limitcount = limitcount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMakeaddress() {
		return makeaddress;
	}
	public void setMakeaddress(String makeaddress) {
		this.makeaddress = makeaddress;
	}
	public int getFreshdate() {
		return freshdate;
	}
	public void setFreshdate(int freshdate) {
		this.freshdate = freshdate;
	}
	public int getShopid() {
		return shopid;
	}
	public void setShopid(int shopid) {
		this.shopid = shopid;
	}
	public int getKindid() {
		return kindid;
	}
	public void setKindid(int kindid) {
		this.kindid = kindid;
	}
	
>>>>>>> branch 'master' of https://github.com/wangcho-github/DiliFresh
}

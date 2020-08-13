package com.web.DiliFresh.model.bean;

import java.sql.Date;

public class Order {
		private int orderid;
		private int buycount;
		private int totalprice;
		private String paystatus;
		private Date paydate;
		private User user;
		private Product product;
		private Address address;
		private Paymethod paymethod;
		public int getOrderid() {
			return orderid;
		}
		public void setOrderid(int orderid) {
			this.orderid = orderid;
		}
		public int getBuycount() {
			return buycount;
		}
		public void setBuycount(int buycount) {
			this.buycount = buycount;
		}
		public int getTotalprice() {
			return totalprice;
		}
		public void setTotalprice(int totalprice) {
			this.totalprice = totalprice;
		}
		public String getPaystatus() {
			return paystatus;
		}
		public void setPaystatus(String paystatus) {
			this.paystatus = paystatus;
		}
		public Date getPaydate() {
			return paydate;
		}
		public void setPaydate(Date paydate) {
			this.paydate = paydate;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public Product getProduct() {
			return product;
		}
		public void setProduct(Product product) {
			this.product = product;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public Paymethod getPaymethod() {
			return paymethod;
		}
		public void setPaymethod(Paymethod paymethod) {
			this.paymethod = paymethod;
		}
		
}

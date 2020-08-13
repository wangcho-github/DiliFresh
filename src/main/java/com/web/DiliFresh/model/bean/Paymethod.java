package com.web.DiliFresh.model.bean;

public class Paymethod {
	private int paymethodid;
	private String paymethodname;
	private Order order;
	public int getPaymethodid() {
		return paymethodid;
	}
	public void setPaymethodid(int paymethodid) {
		this.paymethodid = paymethodid;
	}
	public String getPaymethodname() {
		return paymethodname;
	}
	public void setPaymethodname(String paymethodname) {
		this.paymethodname = paymethodname;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
}

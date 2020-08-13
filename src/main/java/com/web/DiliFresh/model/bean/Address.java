package com.web.DiliFresh.model.bean;

public class Address {
		private int addressid;
		private String addressname;
		private User user;
		public int getAddressid() {
			return addressid;
		}
		public void setAddressid(int addressid) {
			this.addressid = addressid;
		}
		public String getAddressname() {
			return addressname;
		}
		public void setAddressname(String addressname) {
			this.addressname = addressname;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		
}

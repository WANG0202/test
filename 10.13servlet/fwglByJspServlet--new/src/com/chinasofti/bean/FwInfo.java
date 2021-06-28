package com.chinasofti.bean;


public class FwInfo {     
	private int fwId;
	private String title;
	private String loginId;
	
	private int price;
	private double area;
	private String address;
	//外键字段
	//private int typeId;
	//一那端的对象
	private FwType type;
	

	

	public FwType getType() {
		return type;
	}

	public void setType(FwType type) {
		this.type = type;
	}

	public int getFwId() {
		return fwId;
	}

	public void setFwId(int fwId) {
		this.fwId = fwId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}




	public void setArea(double area) {
		this.area = area;
	}










	public String getLoginId() {
		return loginId;
	}





	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}





	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
}

package com.xufei.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Goods implements Serializable{

	private int gid;
	private String gname;
	private BigDecimal price;
	private String sold;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getSold() {
		return sold;
	}
	public void setSold(String sold) {
		this.sold = sold;
	}
	
}

package edu.swjtuhc.demo.model;

public class Goods {
	private int gid;
	private String cagegory;
	private String gname;
	private String price;
	private String sale;
	private String number;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getCagegory() {
		return cagegory;
	}
	public void setCagegory(String cagegory) {
		this.cagegory = cagegory;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSale() {
		return sale;
	}
	public void setSale(String sale) {
		this.sale = sale;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", cagegory=" + cagegory + ", gname=" + gname + ", price=" + price + ", sale="
				+ sale + ", number=" + number + "]";
	}
	

}

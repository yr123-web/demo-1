package edu.swjtuhc.demo.model;

public class Category {
	private int id;
	private String cname;
	private String describe;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", cname=" + cname + ", describe=" + describe + "]";
	}
	

}

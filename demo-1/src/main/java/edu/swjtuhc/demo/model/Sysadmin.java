package edu.swjtuhc.demo.model;

public class Sysadmin {
	int id;
	String adminname;
	String Password;
	String Sex;
	int age;
	int Telephone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getadminName() {
		return adminname;
	}
	public void setName(String name) {
		this.adminname = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTelephone() {
		return Telephone;
	}
	public void setTelephone(int telephone) {
		Telephone = telephone;
	}
	@Override
	public String toString() {
		return "Sysadmin [id=" + id + ", name=" + adminname + ", Password=" + Password + ", Sex=" + Sex + ", age=" + age
				+ ", Telephone=" + Telephone + "]";
	}
	
}

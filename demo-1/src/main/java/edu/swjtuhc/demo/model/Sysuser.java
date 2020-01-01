package edu.swjtuhc.demo.model;

import java.sql.JDBCType;

public class Sysuser {
	int id;
	String name;
	String passward;
	String nickname;
	String sex;
	String email;
	String telephone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "Sysuser [id=" + id + ", name=" + name + ", passward=" + passward + ", nickname=" + nickname + ", sex="
				+ sex + ", email=" + email + ", telephone=" + telephone + "]";
	}


	
}

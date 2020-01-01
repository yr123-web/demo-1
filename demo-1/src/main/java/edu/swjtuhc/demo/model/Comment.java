package edu.swjtuhc.demo.model;

public class Comment {
	
	private int Id;
	private int UserID;
	private int Gid;
	private String Content;
	private int Date;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public int getGid() {
		return Gid;
	}
	public void setGid(int gid) {
		Gid = gid;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public int getDate() {
		return Date;
	}
	public void setDate(int date) {
		Date = date;
	}
	@Override
	public String toString() {
		return "Comment [Id=" + Id + ", UserID=" + UserID + ", Gid=" + Gid + ", Content=" + Content + ", Date=" + Date
				+ "]";
	}

}

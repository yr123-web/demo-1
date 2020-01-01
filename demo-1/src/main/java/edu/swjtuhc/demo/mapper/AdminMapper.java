package edu.swjtuhc.demo.mapper;

import edu.swjtuhc.demo.model.Sysadmin;


public interface AdminMapper {
	public Sysadmin selectAdminname(String adminname);
	public int insertAdmin(Sysadmin admin);
}

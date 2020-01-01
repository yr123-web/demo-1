package edu.swjtuhc.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.AdminMapper;
import edu.swjtuhc.demo.model.Sysadmin;
import edu.swjtuhc.demo.model.Sysadmin;
import edu.swjtuhc.demo.service.AdminService;

@Service
public class AdminServicelmpl implements AdminService {
			
	@Autowired
	AdminMapper adminMapper;
	@Override
	public int register(Sysadmin admin) {
		//调用mapper实现注册
		Sysadmin u0 = adminMapper.selectAdminname(admin.getadminName());
		
		int i = -1;
		if(u0==null) {
			  
			adminMapper.insertAdmin(admin);
		}else {
			i = 2;
		}
		return i;
	} 
}

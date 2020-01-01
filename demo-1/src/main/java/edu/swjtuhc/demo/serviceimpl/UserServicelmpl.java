package edu.swjtuhc.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.UserMapper;
import edu.swjtuhc.demo.model.Sysuser;
import edu.swjtuhc.demo.service.UserSevice;

@Service
public class UserServicelmpl implements UserSevice{
		
	
	@Autowired
	UserMapper userMapper;
	@Override
	public int register(Sysuser user) {
		//调用mapper实现注册
		Sysuser u0 = userMapper.selectUserByUsername(user.getName());
		
		int i = -1;
		if(u0==null) {
			  
			userMapper.insertUser(user);
		}else {
			i = 2;
		}
		return i;
	}
}

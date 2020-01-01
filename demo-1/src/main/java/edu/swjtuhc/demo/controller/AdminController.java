package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.swjtuhc.demo.model.Sysadmin;
import edu.swjtuhc.demo.model.Sysadmin;
import edu.swjtuhc.demo.service.AdminService;
import edu.swjtuhc.demo.service.AdminService;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService  adminService;
	
	@RequestMapping("/register")
	public JSONObject register(@RequestBody Sysadmin admin) {
		JSONObject result = new JSONObject();
		int i =  adminService.register(admin);
	result.put("state", i);
		return result;
	}

}

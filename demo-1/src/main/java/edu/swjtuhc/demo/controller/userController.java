package edu.swjtuhc.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Sysuser;
import edu.swjtuhc.demo.service.UserSevice;
import edu.swjtuhc.demo.servicelmpl.UserServicelmpl;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class userController {
	@Autowired
	UserSevice  userSevice;

		@RequestMapping("/register")
		public JSONObject register(@RequestBody Sysuser user) {
			JSONObject result = new JSONObject();
			int i =  userSevice.register(user);
		result.put("state", i);
			return result;
		}
		
}

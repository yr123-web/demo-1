package edu.swjtuhc.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import edu.swjtuhc.demo.model.Category;
import edu.swjtuhc.demo.service.CategoryService;


@RestController
@RequestMapping("category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("/getList")
	public List<Category> getList(){
		
		return categoryService.getCategoryList();
	}
	@RequestMapping("/createCategory")
	public int createCategory(Category category, MultipartFile file) {
		System.out.println(category);
		System.out.println(file.getOriginalFilename());
		category.setCname(file.getOriginalFilename());
		try {
			categoryService.createCategory(category,file.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

}
	
}

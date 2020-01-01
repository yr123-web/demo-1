package edu.swjtuhc.demo.serviceimpl;

import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.CategoryMapper;
import edu.swjtuhc.demo.model.Category;
import edu.swjtuhc.demo.service.CategoryService;


@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryMapper categoryMapper;

	public List<Category> getCategoryList() {
		// TODO Auto-generated method stub
		return categoryMapper.selectAllCategory();
	}

	

	public int createCategory(Category category, InputStream fileStream) {
		// TODO Auto-generated method stub
		return 0;
	}



	


}

package edu.swjtuhc.demo.service;

import java.io.InputStream;
import java.util.List;

import edu.swjtuhc.demo.model.Category;

public interface CategoryService {
	
public List<Category> getCategoryList();
	
	public int createCategory(Category category, InputStream fileStream);

}

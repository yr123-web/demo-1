package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Category;
@Mapper
public interface CategoryMapper {
	public List<Category> selectAllCategory();

}

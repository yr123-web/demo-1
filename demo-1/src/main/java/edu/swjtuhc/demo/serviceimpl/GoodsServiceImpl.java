package edu.swjtuhc.demo.serviceimpl;

import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.GoodsMapper;
import edu.swjtuhc.demo.model.Category;
import edu.swjtuhc.demo.model.Goods;
import edu.swjtuhc.demo.service.CategoryService;



@Service
public class GoodsServiceImpl implements CategoryService{
	@Autowired
	GoodsMapper goodsMapper;

	public List<Goods> getGoodsList() {
		// TODO Auto-generated method stub
		return goodsMapper.selectAllGoods();
	}

	

	public int createGoods(Goods goods, InputStream fileStream) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public List<Category> getCategoryList() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int createCategory(Category category, InputStream fileStream) {
		// TODO Auto-generated method stub
		return 0;
	}



	

	



	

}

package edu.swjtuhc.demo.service;

import java.io.InputStream;
import java.util.List;

import edu.swjtuhc.demo.model.Goods;


public interface GoodsService {
public List<Goods> getGoodsList();
	
	public int createGoods(Goods goods, InputStream fileStream);

}

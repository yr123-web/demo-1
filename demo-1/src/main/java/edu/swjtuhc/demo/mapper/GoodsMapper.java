package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Goods;

@Mapper
public interface GoodsMapper {
	
	
	
		public List<Goods> selectAllGoods();

	}


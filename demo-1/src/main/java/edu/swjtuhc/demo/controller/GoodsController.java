package edu.swjtuhc.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import edu.swjtuhc.demo.model.Goods;
import edu.swjtuhc.demo.service.GoodsService;

@RestController
@RequestMapping("/goods")

public class GoodsController {
	
	@Autowired
	GoodsService goodsService;
	
	@RequestMapping("/getList")
	public List<Goods> getList(){
		
		return goodsService.getGoodsList();
	}
	@RequestMapping("/createGoods")
	public int createGoods(Goods goods, MultipartFile file) {
		System.out.println(goods);
		System.out.println(file.getOriginalFilename());
		goods.setCagegory(file.getOriginalFilename());
		try {
			goodsService.createGoods(goods,file.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
		

}

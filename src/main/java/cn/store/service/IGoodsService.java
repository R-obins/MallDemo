package cn.store.service;

import java.util.List;

import cn.tedu.store.bean.Goods;

public interface IGoodsService {
	/**
	 * 获取热门商品集合
	 * @param categoryId
	 * @param offset
	 * @param count
	 * @return
	 */
	List<Goods> getGoodsByCategoryId(Integer categoryId,Integer offset,Integer count);

	/**
	 * 获取记录数
	 * @param categoryId
	 * @return
	 */
	Integer getCount(Integer categoryId);
	
	/**
	 * 获取商品信息
	 * @param goodsId
	 * @return
	 */
	Goods getGoodsById(String goodsId);
	
}







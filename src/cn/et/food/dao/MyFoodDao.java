package cn.et.food.dao;

import java.util.List;
import java.util.Map;

public interface MyFoodDao {

	/**
	 * 查询所有数据
	 * @param foodname
	 * @return
	 */
	public abstract List<Map<String, Object>> queryAllFood(String foodname);

	/**
	 * 删除
	 * @param foodId
	 */
	public abstract void deleteFood(String foodId);

	/**
	 * 添加
	 * @param foodName
	 * @param price
	 */
	public abstract void saveFood(String foodName, String price);

	/**
	 * 修改
	 * @param foodId
	 * @param foodName
	 * @param price
	 */
	public abstract void updateFood(String foodId, String foodName, String price);

}
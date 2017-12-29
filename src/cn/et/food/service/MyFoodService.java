package cn.et.food.service;

import java.util.List;
import java.util.Map;

public interface MyFoodService {

	/* (non-Javadoc)
	 * @see cn.et.food.dao.iml.MyFoodDao#queryAllFood(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.et.food.service.iml.MyFoodService#queryAllFood(java.lang.String)
	 */
	public abstract List<Map<String, Object>> queryAllFood(String foodname);

	/* (non-Javadoc)
	 * @see cn.et.food.dao.iml.MyFoodDao#deleteFood(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.et.food.service.iml.MyFoodService#deleteFood(java.lang.String)
	 */
	public abstract void deleteFood(String foodId);

	/* (non-Javadoc)
	 * @see cn.et.food.dao.iml.MyFoodDao#saveFood(java.lang.String, java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.et.food.service.iml.MyFoodService#saveFood(java.lang.String, java.lang.String)
	 */
	public abstract void saveFood(String foodName, String price);

	/* (non-Javadoc)
	 * @see cn.et.food.dao.iml.MyFoodDao#updateFood(java.lang.String, java.lang.String, java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.et.food.service.iml.MyFoodService#updateFood(java.lang.String, java.lang.String, java.lang.String)
	 */
	public abstract void updateFood(String foodId, String foodName, String price);

}
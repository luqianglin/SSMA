package cn.et.food.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.et.food.service.MyFoodService;

@Controller
public class MyFoodController {
	@Autowired
	MyFoodService mdi;
	
	/**
	 * 直接返回对象，springmvc自动转换成json
	 * @param foodname jacson
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	@ResponseBody
	@RequestMapping(value="queryFoodList",method={RequestMethod.GET, RequestMethod.POST})
	public List<Map<String, Object>> queryFoodList(String foodname) throws UnsupportedEncodingException, IOException{
		 List<Map<String, Object>>  queryAllFood = mdi.queryAllFood(foodname);
		 
		return queryAllFood;
	}
	/**
	 * 删除food
	 * @param foodname
	 * @param os
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	@RequestMapping(value="/food/{foodId}",method={RequestMethod.DELETE})
	public String deleteFood(@PathVariable String foodId,OutputStream os) throws UnsupportedEncodingException, IOException{
		try {
			mdi.deleteFood(foodId);
			os.write("1".getBytes("UTF-8"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			os.write("0".getBytes("UTF-8"));
		}
		return null;
	}
	/**
	 * 修改
	 * @param foodId
	 * @param foodName
	 * @param price
	 * @param os
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/food/{foodId}",method={RequestMethod.PUT})
	public String udpateFood(@PathVariable String foodId,String foodName,String price,OutputStream os) throws Exception{
		try {
			mdi.updateFood(foodId, foodName, price);
			os.write("1".getBytes("UTF-8"));
		} catch (Exception e) {
			os.write("0".getBytes("UTF-8"));
		}
		return null;
	}
	/**
	 * 当前菜品
	 * @param foodName
	 * @param price
	 * @param os
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/food",method={RequestMethod.POST})
	public String saveFood(String foodName,String price,OutputStream os) throws Exception{
		try {
			mdi.saveFood(foodName, price);
			os.write("1".getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
			os.write("0".getBytes("UTF-8"));
		}
		return null;
	}
	
}

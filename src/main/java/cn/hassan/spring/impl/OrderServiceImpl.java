package cn.hassan.spring.impl;

import cn.hassan.spring.OrderService;
import cn.hassan.spring.pojo.Order;

/**
 * Created with idea
 * Author: hss
 * Date: 10/23/2018 8:56 AM
 * Description:
 */
public class OrderServiceImpl implements OrderService {

	private static Order order;

	@Override
	public Order createOrder(String username, String product) {
		order = new Order();
		order.setUsername(username);
		order.setProduct(product);
		return order;
	}

	@Override
	public Order queryOrder(String username) {
		Order order = new Order();
		order.setUsername("test");
		order.setProduct("test");
		return order;
	}
}

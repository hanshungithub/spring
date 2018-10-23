package cn.hassan.spring;

import cn.hassan.spring.pojo.Order;

/**
 * Created with idea
 * Author: hss
 * Date: 10/23/2018 8:54 AM
 * Description:
 */
public interface OrderService {

	Order createOrder(String username, String product);

	Order queryOrder(String username);
}

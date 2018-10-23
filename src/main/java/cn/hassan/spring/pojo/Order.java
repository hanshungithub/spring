package cn.hassan.spring.pojo;

/**
 * Created with idea
 * Author: hss
 * Date: 10/23/2018 8:41 AM
 * Description:
 */
public class Order {

	private String username;
	private String product;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Order{" +
				"username='" + username + '\'' +
				", product='" + product + '\'' +
				'}';
	}
}

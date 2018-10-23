package cn.hassan.spring.impl;

import cn.hassan.spring.UserService;
import cn.hassan.spring.pojo.User;

/**
 * Created with idea
 * Author: hss
 * Date: 10/23/2018 8:52 AM
 * Description:
 */
public class UserServiceImpl implements UserService {

	private static User user;

	@Override
	public User createUser(String firstname, String lastname, int age) {
		user = new User();
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setAge(age);
		return user;
	}

	@Override
	public User queryUser() {
		return user;
	}
}

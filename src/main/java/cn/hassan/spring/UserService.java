package cn.hassan.spring;

import cn.hassan.spring.pojo.User;

/**
 * Created with idea
 * Author: hss
 * Date: 10/23/2018 8:31 AM
 * Description:
 */
public interface UserService {

	User createUser(String firstname, String lastname, int age);

	User queryUser();
}

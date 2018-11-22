package cn.hassan.spring.impl;

import cn.hassan.spring.MessageService;

/**
 * Created with idea
 * Author: hss
 * Date: 10/18/2018 7:42 AM
 * Description:
 */
public class MessagesServiceImpl implements MessageService {

	private String baseBean;

	public String getMessages() {
		return "hello,spring" + this.getBaseBean();
	}

	public String getBaseBean() {
		return baseBean;
	}

	public void setBaseBean(String baseBean) {
		this.baseBean = baseBean;
	}
}

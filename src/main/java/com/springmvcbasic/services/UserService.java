package com.springmvcbasic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.springmvcbasic.dao.UserDao;
import com.springmvcbasic.dao.beans.UserBean;
import com.springmvcbasic.model.User;

@Service("userService")
public class UserService {

	@Autowired
	public UserDao userDao;
	
	@Bean
	public UserBean getUserBean() {
		return new UserBean();
	}
	
	public boolean register(User user) {
		UserBean userBean = getUserBean();
		userBean.setFirstName(user.getFirstName());
		userBean.setLastName(user.getLastName());
		userBean.setLogonId(user.getLogonId());
		userBean.setPassword(user.getPassword());
		userBean.setsQuestion(user.getsQuestion());
		userBean.setsAnswer(user.getsAnswer());
		boolean status = userDao.registerUser(userBean);
		return status;
	}
	
	public boolean authenticate(String logonId, String password) {
		boolean status = userDao.authenticateUser(logonId, password);
		return status;
	}
	
	public User getUser(String logonId) {
		UserBean uBean = userDao.getUser(logonId);
		User uModel=null;
		if(uBean!=null) {
			uModel = new User();
			uModel.setFirstName(uBean.getFirstName());
			uModel.setLastName(uBean.getLastName());
		}
		return uModel;
	}
}

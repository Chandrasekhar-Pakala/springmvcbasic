package com.springmvcbasic.dao;

import com.springmvcbasic.dao.beans.UserBean;

public interface UserDao {
	boolean registerUser(UserBean userBean);
	boolean updateUser(UserBean userBean);
	UserBean getUser(String logonId);
	boolean authenticateUser(String id, String password);
}

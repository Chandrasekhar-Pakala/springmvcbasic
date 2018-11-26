package com.springmvcbasic.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvcbasic.dao.UserDao;
import com.springmvcbasic.dao.beans.UserBean;

@Repository("userDao")
@Transactional
public class UserDaoImpl implements UserDao {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	public boolean registerUser(UserBean userBean) {
		sessionFactory.getCurrentSession().saveOrUpdate(userBean);
		return true;
	}

	public boolean updateUser(UserBean userBean) {
		sessionFactory.getCurrentSession().update(userBean);
		return false;
	}

	public UserBean getUser(String logonId) {
		Criteria cr = sessionFactory.getCurrentSession().createCriteria(UserBean.class);
		cr.add(Restrictions.eq("logonId", logonId));
		List<?> results = cr.list();
		return (UserBean)results.get(0);
	}
	
	public boolean deleteUser(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean authenticateUser(String logonId,String password) {
		/*Criteria cr = sessionFactory.getCurrentSession().createCriteria(UserBean.class);
		cr.add(Restrictions.eq("logonId", logonId));
		cr.add(Restrictions.eq("password", password));*/
		Query qry = sessionFactory.getCurrentSession().createQuery("select userId from UserBean where logonId=:logonId and password=:pwd");
		qry.setParameter("logonId", logonId);
		qry.setParameter("pwd", password);
		List<?> results = qry.list();
		if(results.get(0)!=null) {
			return true;
		}
		return false;
	}
	


}

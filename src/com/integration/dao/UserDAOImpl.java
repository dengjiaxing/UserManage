package com.integration.dao;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;
import javax.management.Query;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.omg.PortableServer.THREAD_POLICY_ID;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.integration.entity.User;

import sun.print.resources.serviceui;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO{

	@Override
	public void Save(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);
	}

	@Override
	public List<User> getUser(String name) {
		// TODO Auto-generated method stub
		String hsql="from User u where u.name='"+name+"'";
		List<User> result=(List<User>) this.getHibernateTemplate().find(hsql);
		return result;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(findById(id));
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(user);
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		User user=(User) this.getHibernateTemplate().get(User.class, id);
		return user;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		String queryString="from User";
		List<User> list=this.getHibernateTemplate().find(queryString);
		return list;
	}

}

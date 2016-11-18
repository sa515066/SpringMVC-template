package me.anchora.es.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me.anchora.es.dao.SpringmvcTestDao;
import me.anchora.es.entity.SpringmvcTest;

@Repository("springmvcTestDao")
public class SpringmvcTestDaoImpl implements SpringmvcTestDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	@Override
	public SpringmvcTest load(String id) {
		return (SpringmvcTest) this.getCurrentSession().load(SpringmvcTest.class, id);
	}

	@Override
	public SpringmvcTest get(String id) {
		return (SpringmvcTest)this.getCurrentSession().get(SpringmvcTest.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SpringmvcTest> findAll() {
		List<SpringmvcTest> result = this.getCurrentSession().createQuery("from SpringmvcTest").setCacheable(true).list();
		return result;
	}

	@Override
	public void persist(SpringmvcTest entity) {
		this.getCurrentSession().persist(entity);
	}

	@Override
	public String save(SpringmvcTest entity) {
		return this.getCurrentSession().save(entity).toString();
	}

	@Override
	public void saveOrUpdate(SpringmvcTest entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(String id) {
		this.getCurrentSession().delete(id);
	}

	@Override
	public void flush() {
		this.getCurrentSession().flush();
	}

	@Override
	public SpringmvcTest getByName(String name) {
		SpringmvcTest test = (SpringmvcTest) this.getCurrentSession().createQuery("from SpringmvcTest where name='"+name+"'").setCacheable(true).uniqueResult();
		return test;
	}

}

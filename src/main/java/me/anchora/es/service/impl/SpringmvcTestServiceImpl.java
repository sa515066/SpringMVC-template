package me.anchora.es.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.anchora.es.dao.SpringmvcTestDao;
import me.anchora.es.entity.SpringmvcTest;
import me.anchora.es.service.SpringmvcTestService;

@Service
public class SpringmvcTestServiceImpl implements SpringmvcTestService {

	@Autowired
	private SpringmvcTestDao springmvcTestDao;
	
	@Override
	public SpringmvcTest load(String id) {
		return springmvcTestDao.load(id);
	}

	@Override
	public SpringmvcTest get(String id) {
		return springmvcTestDao.get(id);
	}

	@Override
	public List<SpringmvcTest> findAll() {
		return springmvcTestDao.findAll();
	}

	@Override
	public void persist(SpringmvcTest entity) {
		springmvcTestDao.persist(entity);
	}

	@Override
	public String save(SpringmvcTest entity) {
		return springmvcTestDao.save(entity);
	}

	@Override
	public void saveOrUpdate(SpringmvcTest entity) {
		springmvcTestDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(String id) {
		springmvcTestDao.delete(id);
	}

	@Override
	public void flush() {
		springmvcTestDao.flush();
	}

	@Override
	public SpringmvcTest getByName(String name) {
		return springmvcTestDao.getByName(name);
	}

}

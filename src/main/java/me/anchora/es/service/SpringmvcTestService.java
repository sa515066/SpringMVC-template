package me.anchora.es.service;

import java.util.List;

import me.anchora.es.entity.SpringmvcTest;

public interface SpringmvcTestService {
	SpringmvcTest load(String id);

	SpringmvcTest get(String id);

	SpringmvcTest getByName(String name);
	
	List<SpringmvcTest> findAll();

	void persist(SpringmvcTest entity);

	String save(SpringmvcTest entity);

	void saveOrUpdate(SpringmvcTest entity);

	void delete(String id);

	void flush();
}

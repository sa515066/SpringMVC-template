package me.anchora.es.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="springmvc_test", catalog="mopaasv3")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class SpringmvcTest implements Serializable{

	private static final long serialVersionUID = 3593488908468423881L;
	
	private int id;
	private String name;
	private String password;
	
	public SpringmvcTest(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public SpringmvcTest() {};
	@Id
	@Column(name = "id", unique = true, nullable = false, length = 32)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "name", nullable = false, length = 50)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "password", nullable = false, length = 50)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}

package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * The Entity class which gets persisted to the DB
 * As per the default naming strategy each camel-cased column name gets converted to column_name in the DB schema
 * This naming strategy could be configure by the property "spring.jpa.hibernate.naming-strategy" probably setting the value to "EJB3NamingStrategy"
 * @author prabhatkumar
 *
 */
@Entity
public class Users {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
	private Integer id;
	private String name;
	private String teamName;
	private Integer salary;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
}

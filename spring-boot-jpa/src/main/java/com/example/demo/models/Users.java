package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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

	private Long id;
	private String name;
	private String teamName;
	private Integer salary;
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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

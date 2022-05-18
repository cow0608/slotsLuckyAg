package com.effecia.webdata.entity;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the api_config database table.
 * 
 */
@Entity
@Table(name="api_config")
@NamedQuery(name="ApiConfig.findAll", query="SELECT a FROM ApiConfig a")
public class ApiConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String parameter;

	private String value;

	public ApiConfig() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getParameter() {
		return this.parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
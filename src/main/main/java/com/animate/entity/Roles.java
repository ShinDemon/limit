package com.animate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Roles entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "roles", catalog = "animateweb")
public class Roles implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer cvs;
	private Integer covers;
	private String production;
	private String remark;

	// Constructors

	/** default constructor */
	public Roles() {
	}

	/** full constructor */
	public Roles(String name, Integer cvs, Integer covers, String production,
			String remark) {
		this.name = name;
		this.cvs = cvs;
		this.covers = covers;
		this.production = production;
		this.remark = remark;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "Name", length = 30)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "CVs")
	public Integer getCvs() {
		return this.cvs;
	}

	public void setCvs(Integer cvs) {
		this.cvs = cvs;
	}

	@Column(name = "Covers")
	public Integer getCovers() {
		return this.covers;
	}

	public void setCovers(Integer covers) {
		this.covers = covers;
	}

	@Column(name = "Production", length = 65535)
	public String getProduction() {
		return this.production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	@Column(name = "Remark", length = 50)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
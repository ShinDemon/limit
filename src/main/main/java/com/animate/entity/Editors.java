package com.animate.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * Editors entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "editors", catalog = "animateweb")
public class Editors implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Date updateTime;

	// Constructors

	/** default constructor */
	public Editors() {
	}

	/** full constructor */
	public Editors(String name, Date updateTime) {
		this.name = name;
		this.updateTime = updateTime;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "UpdateTime", length = 10)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
package com.animate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Quarters entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "quarters", catalog = "animateweb")
public class Quarters implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer quarter;
	private Integer oneSet;

	// Constructors

	/** default constructor */
	public Quarters() {
	}

	/** full constructor */
	public Quarters(Integer quarter, Integer oneSet) {
		this.quarter = quarter;
		this.oneSet = oneSet;
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

	@Column(name = "Quarter")
	public Integer getQuarter() {
		return this.quarter;
	}

	public void setQuarter(Integer quarter) {
		this.quarter = quarter;
	}

	@Column(name = "OneSet")
	public Integer getOneSet() {
		return this.oneSet;
	}

	public void setOneSet(Integer oneSet) {
		this.oneSet = oneSet;
	}

}
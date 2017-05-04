package com.animate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Covers entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "covers", catalog = "animateweb")
public class Covers implements java.io.Serializable {

	// Fields

	private Integer id;
	private String paths;
	private String remark;
	private Integer indexs;
	private Integer type;

	// Constructors

	/** default constructor */
	public Covers() {
	}

	/** full constructor */
	public Covers(String paths, String remark, Integer indexs, Integer type) {
		this.paths = paths;
		this.remark = remark;
		this.indexs = indexs;
		this.type = type;
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

	@Column(name = "Paths", length = 50)
	public String getPaths() {
		return this.paths;
	}

	public void setPaths(String paths) {
		this.paths = paths;
	}

	@Column(name = "Remark", length = 50)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "Indexs")
	public Integer getIndexs() {
		return this.indexs;
	}

	public void setIndexs(Integer indexs) {
		this.indexs = indexs;
	}

	@Column(name = "Type")
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}
package com.animate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Storys entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "storys", catalog = "animateweb")
public class Storys implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer oneSet;
	private String introduce;
	private String remark;

	// Constructors

	/** default constructor */
	public Storys() {
	}

	/** full constructor */
	public Storys(Integer oneSet, String introduce, String remark) {
		this.oneSet = oneSet;
		this.introduce = introduce;
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

	@Column(name = "OneSet")
	public Integer getOneSet() {
		return this.oneSet;
	}

	public void setOneSet(Integer oneSet) {
		this.oneSet = oneSet;
	}

	@Column(name = "Introduce", length = 65535)
	public String getIntroduce() {
		return this.introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	@Column(name = "Remark", length = 50)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
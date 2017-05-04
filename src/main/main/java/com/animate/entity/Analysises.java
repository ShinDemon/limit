package com.animate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Analysises entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "analysises", catalog = "animateweb")
public class Analysises implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String introduce;
	private String remark;
	private String quote;

	// Constructors

	/** default constructor */
	public Analysises() {
	}

	/** full constructor */
	public Analysises(String name, String introduce, String remark, String quote) {
		this.name = name;
		this.introduce = introduce;
		this.remark = remark;
		this.quote = quote;
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

	@Column(name = "Quote", length = 65535)
	public String getQuote() {
		return this.quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

}
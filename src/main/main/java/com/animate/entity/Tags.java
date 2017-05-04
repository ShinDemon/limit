package com.animate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Tags entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tags", catalog = "animateweb")
public class Tags implements java.io.Serializable {

	// Fields

	private Integer id;
	private String ttitle;
	private String remark;
	private Integer type;

	// Constructors

	/** default constructor */
	public Tags() {
	}

	/** full constructor */
	public Tags(String ttitle, String remark, Integer type) {
		this.ttitle = ttitle;
		this.remark = remark;
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

	@Column(name = "Ttitle", length = 30)
	public String getTtitle() {
		return this.ttitle;
	}

	public void setTtitle(String ttitle) {
		this.ttitle = ttitle;
	}

	@Column(name = "Remark", length = 50)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "Type")
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}
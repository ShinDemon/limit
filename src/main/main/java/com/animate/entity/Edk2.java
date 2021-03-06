package com.animate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Edk2 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "edk2", catalog = "animateweb")
public class Edk2 implements java.io.Serializable {

	// Fields

	private Integer id;
	private String link;
	private String remark;
	private Integer resolution;
	private String size;
	private Integer type;

	// Constructors

	/** default constructor */
	public Edk2() {
	}

	/** full constructor */
	public Edk2(String link, String remark, Integer resolution, String size,
			Integer type) {
		this.link = link;
		this.remark = remark;
		this.resolution = resolution;
		this.size = size;
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

	@Column(name = "Link")
	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Column(name = "Remark", length = 50)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "Resolution")
	public Integer getResolution() {
		return this.resolution;
	}

	public void setResolution(Integer resolution) {
		this.resolution = resolution;
	}

	@Column(name = "Size", length = 30)
	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Column(name = "Type")
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}
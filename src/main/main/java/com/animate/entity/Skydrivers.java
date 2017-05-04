package com.animate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Skydrivers entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "skydrivers", catalog = "animateweb")
public class Skydrivers implements java.io.Serializable {

	// Fields

	private Integer id;
	private String link;
	private String remark;
	private Integer resolution;
	private String size;
	private Integer type;
	private Integer skyType;

	// Constructors

	/** default constructor */
	public Skydrivers() {
	}

	/** full constructor */
	public Skydrivers(String link, String remark, Integer resolution,
			String size, Integer type, Integer skyType) {
		this.link = link;
		this.remark = remark;
		this.resolution = resolution;
		this.size = size;
		this.type = type;
		this.skyType = skyType;
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

	@Column(name = "SkyType")
	public Integer getSkyType() {
		return this.skyType;
	}

	public void setSkyType(Integer skyType) {
		this.skyType = skyType;
	}

}
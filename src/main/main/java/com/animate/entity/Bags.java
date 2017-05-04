package com.animate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Bags entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "bags", catalog = "animateweb")
public class Bags implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer bts;
	private Integer thunders;
	private Integer edk2s;
	private Integer skyDrivers;
	private Integer type;
	private Integer source;
	private Integer count;
	private String size;
	private Integer bagType;
	private String remark;

	// Constructors

	/** default constructor */
	public Bags() {
	}

	/** full constructor */
	public Bags(String name, Integer bts, Integer thunders, Integer edk2s,
			Integer skyDrivers, Integer type, Integer source, Integer count,
			String size, Integer bagType, String remark) {
		this.name = name;
		this.bts = bts;
		this.thunders = thunders;
		this.edk2s = edk2s;
		this.skyDrivers = skyDrivers;
		this.type = type;
		this.source = source;
		this.count = count;
		this.size = size;
		this.bagType = bagType;
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

	@Column(name = "BTs")
	public Integer getBts() {
		return this.bts;
	}

	public void setBts(Integer bts) {
		this.bts = bts;
	}

	@Column(name = "Thunders")
	public Integer getThunders() {
		return this.thunders;
	}

	public void setThunders(Integer thunders) {
		this.thunders = thunders;
	}

	@Column(name = "EDK2s")
	public Integer getEdk2s() {
		return this.edk2s;
	}

	public void setEdk2s(Integer edk2s) {
		this.edk2s = edk2s;
	}

	@Column(name = "SkyDrivers")
	public Integer getSkyDrivers() {
		return this.skyDrivers;
	}

	public void setSkyDrivers(Integer skyDrivers) {
		this.skyDrivers = skyDrivers;
	}

	@Column(name = "Type")
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Column(name = "Source")
	public Integer getSource() {
		return this.source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	@Column(name = "Count")
	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Column(name = "Size", length = 30)
	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Column(name = "BagType")
	public Integer getBagType() {
		return this.bagType;
	}

	public void setBagType(Integer bagType) {
		this.bagType = bagType;
	}

	@Column(name = "Remark", length = 50)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
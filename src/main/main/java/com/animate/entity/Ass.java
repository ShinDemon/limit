package com.animate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Ass entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ass", catalog = "animateweb")
public class Ass implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer thunders;
	private Integer bts;
	private Integer skyDrivers;
	private Integer edk2s;
	private String size;

	// Constructors

	/** default constructor */
	public Ass() {
	}

	/** full constructor */
	public Ass(String name, Integer thunders, Integer bts, Integer skyDrivers,
			Integer edk2s, String size) {
		this.name = name;
		this.thunders = thunders;
		this.bts = bts;
		this.skyDrivers = skyDrivers;
		this.edk2s = edk2s;
		this.size = size;
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

	@Column(name = "Thunders")
	public Integer getThunders() {
		return this.thunders;
	}

	public void setThunders(Integer thunders) {
		this.thunders = thunders;
	}

	@Column(name = "BTs")
	public Integer getBts() {
		return this.bts;
	}

	public void setBts(Integer bts) {
		this.bts = bts;
	}

	@Column(name = "SkyDrivers")
	public Integer getSkyDrivers() {
		return this.skyDrivers;
	}

	public void setSkyDrivers(Integer skyDrivers) {
		this.skyDrivers = skyDrivers;
	}

	@Column(name = "EDK2s")
	public Integer getEdk2s() {
		return this.edk2s;
	}

	public void setEdk2s(Integer edk2s) {
		this.edk2s = edk2s;
	}

	@Column(name = "Size", length = 30)
	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
package com.animate.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Permission entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "permission", catalog = "animateweb")
public class Permission implements java.io.Serializable {

	// Fields

	private Integer id;
	private String code;
	private String whatCanDo;
	private Set<Characters> characterses = new HashSet<Characters>(0);

	// Constructors

	/** default constructor */
	public Permission() {
	}

	/** full constructor */
	public Permission(String code, String whatCanDo,
			Set<Characters> characterses) {
		this.code = code;
		this.whatCanDo = whatCanDo;
		this.characterses = characterses;
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

	@Column(name = "Code", length = 30)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "WhatCanDo", length = 30)
	public String getWhatCanDo() {
		return this.whatCanDo;
	}

	public void setWhatCanDo(String whatCanDo) {
		this.whatCanDo = whatCanDo;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "rolerelapermission", catalog = "animateweb", joinColumns = { @JoinColumn(name = "Permissions", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Roles", nullable = false, updatable = false) })
	public Set<Characters> getCharacterses() {
		return this.characterses;
	}

	public void setCharacterses(Set<Characters> characterses) {
		this.characterses = characterses;
	}

}
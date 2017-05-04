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
 * Users entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "users", catalog = "animateweb")
public class Users implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userName;
	private String password;
	private Set<Characters> characterses = new HashSet<Characters>(0);

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	/** full constructor */
	public Users(String userName, String password, Set<Characters> characterses) {
		this.userName = userName;
		this.password = password;
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

	@Column(name = "UserName", nullable = false, length = 30)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "Password", nullable = false, length = 30)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "userrelarole", catalog = "animateweb", joinColumns = { @JoinColumn(name = "Users", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Roles", nullable = false, updatable = false) })
	public Set<Characters> getCharacterses() {
		return this.characterses;
	}

	public void setCharacterses(Set<Characters> characterses) {
		this.characterses = characterses;
	}

}
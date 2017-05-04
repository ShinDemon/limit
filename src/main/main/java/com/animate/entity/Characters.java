package com.animate.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Characters entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "characters", catalog = "animateweb")
public class Characters implements java.io.Serializable {

	// Fields

	private Integer id;
	private String code;
	private String roleName;
	private Set<Permission> permissions = new HashSet<Permission>(0);
	private Set<Users> userses = new HashSet<Users>(0);

	// Constructors

	/** default constructor */
	public Characters() {
	}

	/** full constructor */
	public Characters(String code, String roleName,
			Set<Permission> permissions, Set<Users> userses) {
		this.code = code;
		this.roleName = roleName;
		this.permissions = permissions;
		this.userses = userses;
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

	@Column(name = "RoleName", length = 30)
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "characterses")
	public Set<Permission> getPermissions() {
		return this.permissions;
	}

	public void setPermissions(Set<Permission> permissions) {
		this.permissions = permissions;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "characterses")
	public Set<Users> getUserses() {
		return this.userses;
	}

	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

}
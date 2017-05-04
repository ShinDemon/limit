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
 * Musics entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "musics", catalog = "animateweb")
public class Musics implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer isOp;
	private Integer isEd;
	private Integer isInsert;
	private Integer isRoleSong;
	private Integer isTr;
	private Integer haveTr;
	private Integer trs;
	private String textIndex;
	private String remark;
	private String size;
	private Integer bagType;
	private Integer musicType;
	private Integer isGameSong;
	private Integer isAnimateSong;
	private Set<Games> gameses = new HashSet<Games>(0);
	private Set<Animate> animates = new HashSet<Animate>(0);

	// Constructors

	/** default constructor */
	public Musics() {
	}

	/** full constructor */
	public Musics(String name, Integer isOp, Integer isEd, Integer isInsert,
			Integer isRoleSong, Integer isTr, Integer haveTr, Integer trs,
			String textIndex, String remark, String size, Integer bagType,
			Integer musicType, Integer isGameSong, Integer isAnimateSong,
			Set<Games> gameses, Set<Animate> animates) {
		this.name = name;
		this.isOp = isOp;
		this.isEd = isEd;
		this.isInsert = isInsert;
		this.isRoleSong = isRoleSong;
		this.isTr = isTr;
		this.haveTr = haveTr;
		this.trs = trs;
		this.textIndex = textIndex;
		this.remark = remark;
		this.size = size;
		this.bagType = bagType;
		this.musicType = musicType;
		this.isGameSong = isGameSong;
		this.isAnimateSong = isAnimateSong;
		this.gameses = gameses;
		this.animates = animates;
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

	@Column(name = "isOP")
	public Integer getIsOp() {
		return this.isOp;
	}

	public void setIsOp(Integer isOp) {
		this.isOp = isOp;
	}

	@Column(name = "isED")
	public Integer getIsEd() {
		return this.isEd;
	}

	public void setIsEd(Integer isEd) {
		this.isEd = isEd;
	}

	@Column(name = "isInsert")
	public Integer getIsInsert() {
		return this.isInsert;
	}

	public void setIsInsert(Integer isInsert) {
		this.isInsert = isInsert;
	}

	@Column(name = "isRoleSong")
	public Integer getIsRoleSong() {
		return this.isRoleSong;
	}

	public void setIsRoleSong(Integer isRoleSong) {
		this.isRoleSong = isRoleSong;
	}

	@Column(name = "isTR")
	public Integer getIsTr() {
		return this.isTr;
	}

	public void setIsTr(Integer isTr) {
		this.isTr = isTr;
	}

	@Column(name = "haveTR")
	public Integer getHaveTr() {
		return this.haveTr;
	}

	public void setHaveTr(Integer haveTr) {
		this.haveTr = haveTr;
	}

	@Column(name = "TRs")
	public Integer getTrs() {
		return this.trs;
	}

	public void setTrs(Integer trs) {
		this.trs = trs;
	}

	@Column(name = "TextIndex", length = 65535)
	public String getTextIndex() {
		return this.textIndex;
	}

	public void setTextIndex(String textIndex) {
		this.textIndex = textIndex;
	}

	@Column(name = "Remark", length = 50)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	@Column(name = "MusicType")
	public Integer getMusicType() {
		return this.musicType;
	}

	public void setMusicType(Integer musicType) {
		this.musicType = musicType;
	}

	@Column(name = "isGameSong")
	public Integer getIsGameSong() {
		return this.isGameSong;
	}

	public void setIsGameSong(Integer isGameSong) {
		this.isGameSong = isGameSong;
	}

	@Column(name = "isAnimateSong")
	public Integer getIsAnimateSong() {
		return this.isAnimateSong;
	}

	public void setIsAnimateSong(Integer isAnimateSong) {
		this.isAnimateSong = isAnimateSong;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "gamemusic", catalog = "animateweb", joinColumns = { @JoinColumn(name = "Musics", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Games", nullable = false, updatable = false) })
	public Set<Games> getGameses() {
		return this.gameses;
	}

	public void setGameses(Set<Games> gameses) {
		this.gameses = gameses;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "animatemusic", catalog = "animateweb", joinColumns = { @JoinColumn(name = "Musics", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Animates", nullable = false, updatable = false) })
	public Set<Animate> getAnimates() {
		return this.animates;
	}

	public void setAnimates(Set<Animate> animates) {
		this.animates = animates;
	}

}
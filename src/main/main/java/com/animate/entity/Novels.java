package com.animate.entity;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * Novels entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "novels", catalog = "animateweb")
public class Novels implements java.io.Serializable {

	// Fields

	private Integer id;
	private String chineseName;
	private String japaneseName;
	private String romanName;
	private Integer tags;
	private Integer roles;
	private Integer covers;
	private Integer storys;
	private Integer bts;
	private Integer thunders;
	private Integer edk2s;
	private Integer skyDrivers;
	private Integer bags;
	private Date publishDate;
	private Integer editors;
	private Integer authors;
	private Integer producers;
	private Integer analysis;
	private Integer isAnimate;
	private Integer animates;
	private Integer isComic;
	private Integer comics;
	private Integer isGame;
	private Integer games;
	private Integer isAge;
	private Integer isPublish;
	private Integer isEnd;
	private Integer isCanDown;
	private Integer isTr;
	private Integer havaTr;
	private Integer trs;
	private String remark;
	private Set<Animate> animates_1 = new HashSet<Animate>(0);
	private Set<Comics> comicses = new HashSet<Comics>(0);
	private Set<Games> gameses = new HashSet<Games>(0);

	// Constructors

	/** default constructor */
	public Novels() {
	}

	/** full constructor */
	public Novels(String chineseName, String japaneseName, String romanName,
			Integer tags, Integer roles, Integer covers, Integer storys,
			Integer bts, Integer thunders, Integer edk2s, Integer skyDrivers,
			Integer bags, Date publishDate, Integer editors, Integer authors,
			Integer producers, Integer analysis, Integer isAnimate,
			Integer animates, Integer isComic, Integer comics, Integer isGame,
			Integer games, Integer isAge, Integer isPublish, Integer isEnd,
			Integer isCanDown, Integer isTr, Integer havaTr, Integer trs,
			String remark, Set<Animate> animates_1, Set<Comics> comicses,
			Set<Games> gameses) {
		this.chineseName = chineseName;
		this.japaneseName = japaneseName;
		this.romanName = romanName;
		this.tags = tags;
		this.roles = roles;
		this.covers = covers;
		this.storys = storys;
		this.bts = bts;
		this.thunders = thunders;
		this.edk2s = edk2s;
		this.skyDrivers = skyDrivers;
		this.bags = bags;
		this.publishDate = publishDate;
		this.editors = editors;
		this.authors = authors;
		this.producers = producers;
		this.analysis = analysis;
		this.isAnimate = isAnimate;
		this.animates = animates;
		this.isComic = isComic;
		this.comics = comics;
		this.isGame = isGame;
		this.games = games;
		this.isAge = isAge;
		this.isPublish = isPublish;
		this.isEnd = isEnd;
		this.isCanDown = isCanDown;
		this.isTr = isTr;
		this.havaTr = havaTr;
		this.trs = trs;
		this.remark = remark;
		this.animates_1 = animates_1;
		this.comicses = comicses;
		this.gameses = gameses;
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

	@Column(name = "ChineseName", length = 30)
	public String getChineseName() {
		return this.chineseName;
	}

	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}

	@Column(name = "JapaneseName", length = 30)
	public String getJapaneseName() {
		return this.japaneseName;
	}

	public void setJapaneseName(String japaneseName) {
		this.japaneseName = japaneseName;
	}

	@Column(name = "RomanName", length = 30)
	public String getRomanName() {
		return this.romanName;
	}

	public void setRomanName(String romanName) {
		this.romanName = romanName;
	}

	@Column(name = "Tags")
	public Integer getTags() {
		return this.tags;
	}

	public void setTags(Integer tags) {
		this.tags = tags;
	}

	@Column(name = "Roles")
	public Integer getRoles() {
		return this.roles;
	}

	public void setRoles(Integer roles) {
		this.roles = roles;
	}

	@Column(name = "Covers")
	public Integer getCovers() {
		return this.covers;
	}

	public void setCovers(Integer covers) {
		this.covers = covers;
	}

	@Column(name = "Storys")
	public Integer getStorys() {
		return this.storys;
	}

	public void setStorys(Integer storys) {
		this.storys = storys;
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

	@Column(name = "Bags")
	public Integer getBags() {
		return this.bags;
	}

	public void setBags(Integer bags) {
		this.bags = bags;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PublishDate", length = 10)
	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	@Column(name = "Editors")
	public Integer getEditors() {
		return this.editors;
	}

	public void setEditors(Integer editors) {
		this.editors = editors;
	}

	@Column(name = "Authors")
	public Integer getAuthors() {
		return this.authors;
	}

	public void setAuthors(Integer authors) {
		this.authors = authors;
	}

	@Column(name = "Producers")
	public Integer getProducers() {
		return this.producers;
	}

	public void setProducers(Integer producers) {
		this.producers = producers;
	}

	@Column(name = "Analysis")
	public Integer getAnalysis() {
		return this.analysis;
	}

	public void setAnalysis(Integer analysis) {
		this.analysis = analysis;
	}

	@Column(name = "isAnimate")
	public Integer getIsAnimate() {
		return this.isAnimate;
	}

	public void setIsAnimate(Integer isAnimate) {
		this.isAnimate = isAnimate;
	}

	@Column(name = "Animates")
	public Integer getAnimates() {
		return this.animates;
	}

	public void setAnimates(Integer animates) {
		this.animates = animates;
	}

	@Column(name = "isComic")
	public Integer getIsComic() {
		return this.isComic;
	}

	public void setIsComic(Integer isComic) {
		this.isComic = isComic;
	}

	@Column(name = "Comics")
	public Integer getComics() {
		return this.comics;
	}

	public void setComics(Integer comics) {
		this.comics = comics;
	}

	@Column(name = "isGame")
	public Integer getIsGame() {
		return this.isGame;
	}

	public void setIsGame(Integer isGame) {
		this.isGame = isGame;
	}

	@Column(name = "Games")
	public Integer getGames() {
		return this.games;
	}

	public void setGames(Integer games) {
		this.games = games;
	}

	@Column(name = "isAge")
	public Integer getIsAge() {
		return this.isAge;
	}

	public void setIsAge(Integer isAge) {
		this.isAge = isAge;
	}

	@Column(name = "isPublish")
	public Integer getIsPublish() {
		return this.isPublish;
	}

	public void setIsPublish(Integer isPublish) {
		this.isPublish = isPublish;
	}

	@Column(name = "isEnd")
	public Integer getIsEnd() {
		return this.isEnd;
	}

	public void setIsEnd(Integer isEnd) {
		this.isEnd = isEnd;
	}

	@Column(name = "isCanDown")
	public Integer getIsCanDown() {
		return this.isCanDown;
	}

	public void setIsCanDown(Integer isCanDown) {
		this.isCanDown = isCanDown;
	}

	@Column(name = "isTR")
	public Integer getIsTr() {
		return this.isTr;
	}

	public void setIsTr(Integer isTr) {
		this.isTr = isTr;
	}

	@Column(name = "havaTR")
	public Integer getHavaTr() {
		return this.havaTr;
	}

	public void setHavaTr(Integer havaTr) {
		this.havaTr = havaTr;
	}

	@Column(name = "TRs")
	public Integer getTrs() {
		return this.trs;
	}

	public void setTrs(Integer trs) {
		this.trs = trs;
	}

	@Column(name = "Remark", length = 50)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "animaterelanovel", catalog = "animateweb", joinColumns = { @JoinColumn(name = "Novels", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Animates", nullable = false, updatable = false) })
	public Set<Animate> getAnimates_1() {
		return this.animates_1;
	}

	public void setAnimates_1(Set<Animate> animates_1) {
		this.animates_1 = animates_1;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "comicrelanovel", catalog = "animateweb", joinColumns = { @JoinColumn(name = "Novels", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Comics", nullable = false, updatable = false) })
	public Set<Comics> getComicses() {
		return this.comicses;
	}

	public void setComicses(Set<Comics> comicses) {
		this.comicses = comicses;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "gamerelanovel", catalog = "animateweb", joinColumns = { @JoinColumn(name = "Novels", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Games", nullable = false, updatable = false) })
	public Set<Games> getGameses() {
		return this.gameses;
	}

	public void setGameses(Set<Games> gameses) {
		this.gameses = gameses;
	}

}
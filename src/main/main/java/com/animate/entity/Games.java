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
 * Games entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "games", catalog = "animateweb")
public class Games implements java.io.Serializable {

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
	private Integer musics;
	private Date publishDate;
	private Integer editors;
	private Integer authors;
	private Integer producers;
	private Integer analysis;
	private Integer isAnimate;
	private Integer animates;
	private Integer isNovel;
	private Integer novels;
	private Integer isComic;
	private Integer comics;
	private Integer isTr;
	private Integer haveTr;
	private Integer trs;
	private Integer isAge;
	private Integer isPublish;
	private Integer gamerType;
	private Integer isCanDown;
	private String remark;
	private Set<Novels> novelses = new HashSet<Novels>(0);
	private Set<Comics> comicses = new HashSet<Comics>(0);
	private Set<Musics> musicses = new HashSet<Musics>(0);
	private Set<Animate> animates_1 = new HashSet<Animate>(0);

	// Constructors

	/** default constructor */
	public Games() {
	}

	/** full constructor */
	public Games(String chineseName, String japaneseName, String romanName,
			Integer tags, Integer roles, Integer covers, Integer storys,
			Integer bts, Integer thunders, Integer edk2s, Integer skyDrivers,
			Integer bags, Integer musics, Date publishDate, Integer editors,
			Integer authors, Integer producers, Integer analysis,
			Integer isAnimate, Integer animates, Integer isNovel,
			Integer novels, Integer isComic, Integer comics, Integer isTr,
			Integer haveTr, Integer trs, Integer isAge, Integer isPublish,
			Integer gamerType, Integer isCanDown, String remark,
			Set<Novels> novelses, Set<Comics> comicses, Set<Musics> musicses,
			Set<Animate> animates_1) {
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
		this.musics = musics;
		this.publishDate = publishDate;
		this.editors = editors;
		this.authors = authors;
		this.producers = producers;
		this.analysis = analysis;
		this.isAnimate = isAnimate;
		this.animates = animates;
		this.isNovel = isNovel;
		this.novels = novels;
		this.isComic = isComic;
		this.comics = comics;
		this.isTr = isTr;
		this.haveTr = haveTr;
		this.trs = trs;
		this.isAge = isAge;
		this.isPublish = isPublish;
		this.gamerType = gamerType;
		this.isCanDown = isCanDown;
		this.remark = remark;
		this.novelses = novelses;
		this.comicses = comicses;
		this.musicses = musicses;
		this.animates_1 = animates_1;
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

	@Column(name = "Musics")
	public Integer getMusics() {
		return this.musics;
	}

	public void setMusics(Integer musics) {
		this.musics = musics;
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

	@Column(name = "isNovel")
	public Integer getIsNovel() {
		return this.isNovel;
	}

	public void setIsNovel(Integer isNovel) {
		this.isNovel = isNovel;
	}

	@Column(name = "Novels")
	public Integer getNovels() {
		return this.novels;
	}

	public void setNovels(Integer novels) {
		this.novels = novels;
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

	@Column(name = "GamerType")
	public Integer getGamerType() {
		return this.gamerType;
	}

	public void setGamerType(Integer gamerType) {
		this.gamerType = gamerType;
	}

	@Column(name = "isCanDown")
	public Integer getIsCanDown() {
		return this.isCanDown;
	}

	public void setIsCanDown(Integer isCanDown) {
		this.isCanDown = isCanDown;
	}

	@Column(name = "Remark", length = 50)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gameses")
	public Set<Novels> getNovelses() {
		return this.novelses;
	}

	public void setNovelses(Set<Novels> novelses) {
		this.novelses = novelses;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "comicrelagame", catalog = "animateweb", joinColumns = { @JoinColumn(name = "Games", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Comics", nullable = false, updatable = false) })
	public Set<Comics> getComicses() {
		return this.comicses;
	}

	public void setComicses(Set<Comics> comicses) {
		this.comicses = comicses;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "gameses")
	public Set<Musics> getMusicses() {
		return this.musicses;
	}

	public void setMusicses(Set<Musics> musicses) {
		this.musicses = musicses;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "gamerelaanimate", catalog = "animateweb", joinColumns = { @JoinColumn(name = "Games", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Animates", nullable = false, updatable = false) })
	public Set<Animate> getAnimates_1() {
		return this.animates_1;
	}

	public void setAnimates_1(Set<Animate> animates_1) {
		this.animates_1 = animates_1;
	}

}
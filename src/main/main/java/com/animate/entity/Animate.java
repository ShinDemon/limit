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
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * Animate entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "animate", catalog = "animateweb")
public class Animate implements java.io.Serializable {

	// Fields

	private Integer id;
	private String chineseName;
	private String japaneseName;
	private String romanName;
	private Integer tags;
	private Integer roles;
	private Integer covers;
	private Integer story;
	private Integer bts;
	private Integer thunders;
	private Integer edk2s;
	private Integer skydrivers;
	private Integer musics;
	private Integer trmusics;
	private Integer bags;
	private Integer trbags;
	private Integer novels;
	private Integer trnovels;
	private Integer comics;
	private Integer trcomics;
	private Integer games;
	private Integer trgames;
	private Integer movies;
	private Integer quarters;
	private Integer isOriginal;
	private Integer isGame;
	private Integer isNovel;
	private Integer isComic;
	private Date publishDate;
	private Integer editor;
	private Integer authors;
	private Integer producers;
	private Integer analysis;
	private Integer ass;
	private Integer isEnd;
	private Integer isPublish;
	private Integer isAge;
	private Integer is3d;
	private Integer isMovie;
	private Integer isCanDown;
	private String remark;
	private Set<Novels> novelses = new HashSet<Novels>(0);
	private Set<Games> gameses = new HashSet<Games>(0);
	private Set<Musics> musicses = new HashSet<Musics>(0);
	private Set<Comics> comicses = new HashSet<Comics>(0);

	// Constructors

	/** default constructor */
	public Animate() {
	}

	/** full constructor */
	public Animate(String chineseName, String japaneseName, String romanName,
			Integer tags, Integer roles, Integer covers, Integer story,
			Integer bts, Integer thunders, Integer edk2s, Integer skydrivers,
			Integer musics, Integer trmusics, Integer bags, Integer trbags,
			Integer novels, Integer trnovels, Integer comics, Integer trcomics,
			Integer games, Integer trgames, Integer movies, Integer quarters,
			Integer isOriginal, Integer isGame, Integer isNovel,
			Integer isComic, Date publishDate, Integer editor, Integer authors,
			Integer producers, Integer analysis, Integer ass, Integer isEnd,
			Integer isPublish, Integer isAge, Integer is3d, Integer isMovie,
			Integer isCanDown, String remark, Set<Novels> novelses,
			Set<Games> gameses, Set<Musics> musicses, Set<Comics> comicses) {
		this.chineseName = chineseName;
		this.japaneseName = japaneseName;
		this.romanName = romanName;
		this.tags = tags;
		this.roles = roles;
		this.covers = covers;
		this.story = story;
		this.bts = bts;
		this.thunders = thunders;
		this.edk2s = edk2s;
		this.skydrivers = skydrivers;
		this.musics = musics;
		this.trmusics = trmusics;
		this.bags = bags;
		this.trbags = trbags;
		this.novels = novels;
		this.trnovels = trnovels;
		this.comics = comics;
		this.trcomics = trcomics;
		this.games = games;
		this.trgames = trgames;
		this.movies = movies;
		this.quarters = quarters;
		this.isOriginal = isOriginal;
		this.isGame = isGame;
		this.isNovel = isNovel;
		this.isComic = isComic;
		this.publishDate = publishDate;
		this.editor = editor;
		this.authors = authors;
		this.producers = producers;
		this.analysis = analysis;
		this.ass = ass;
		this.isEnd = isEnd;
		this.isPublish = isPublish;
		this.isAge = isAge;
		this.is3d = is3d;
		this.isMovie = isMovie;
		this.isCanDown = isCanDown;
		this.remark = remark;
		this.novelses = novelses;
		this.gameses = gameses;
		this.musicses = musicses;
		this.comicses = comicses;
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

	@Column(name = "Story")
	public Integer getStory() {
		return this.story;
	}

	public void setStory(Integer story) {
		this.story = story;
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

	@Column(name = "Edk2s")
	public Integer getEdk2s() {
		return this.edk2s;
	}

	public void setEdk2s(Integer edk2s) {
		this.edk2s = edk2s;
	}

	@Column(name = "Skydrivers")
	public Integer getSkydrivers() {
		return this.skydrivers;
	}

	public void setSkydrivers(Integer skydrivers) {
		this.skydrivers = skydrivers;
	}

	@Column(name = "Musics")
	public Integer getMusics() {
		return this.musics;
	}

	public void setMusics(Integer musics) {
		this.musics = musics;
	}

	@Column(name = "TRMusics")
	public Integer getTrmusics() {
		return this.trmusics;
	}

	public void setTrmusics(Integer trmusics) {
		this.trmusics = trmusics;
	}

	@Column(name = "Bags")
	public Integer getBags() {
		return this.bags;
	}

	public void setBags(Integer bags) {
		this.bags = bags;
	}

	@Column(name = "TRBags")
	public Integer getTrbags() {
		return this.trbags;
	}

	public void setTrbags(Integer trbags) {
		this.trbags = trbags;
	}

	@Column(name = "Novels")
	public Integer getNovels() {
		return this.novels;
	}

	public void setNovels(Integer novels) {
		this.novels = novels;
	}

	@Column(name = "TRNovels")
	public Integer getTrnovels() {
		return this.trnovels;
	}

	public void setTrnovels(Integer trnovels) {
		this.trnovels = trnovels;
	}

	@Column(name = "Comics")
	public Integer getComics() {
		return this.comics;
	}

	public void setComics(Integer comics) {
		this.comics = comics;
	}

	@Column(name = "TRComics")
	public Integer getTrcomics() {
		return this.trcomics;
	}

	public void setTrcomics(Integer trcomics) {
		this.trcomics = trcomics;
	}

	@Column(name = "Games")
	public Integer getGames() {
		return this.games;
	}

	public void setGames(Integer games) {
		this.games = games;
	}

	@Column(name = "TRGames")
	public Integer getTrgames() {
		return this.trgames;
	}

	public void setTrgames(Integer trgames) {
		this.trgames = trgames;
	}

	@Column(name = "Movies")
	public Integer getMovies() {
		return this.movies;
	}

	public void setMovies(Integer movies) {
		this.movies = movies;
	}

	@Column(name = "Quarters")
	public Integer getQuarters() {
		return this.quarters;
	}

	public void setQuarters(Integer quarters) {
		this.quarters = quarters;
	}

	@Column(name = "isOriginal")
	public Integer getIsOriginal() {
		return this.isOriginal;
	}

	public void setIsOriginal(Integer isOriginal) {
		this.isOriginal = isOriginal;
	}

	@Column(name = "isGame")
	public Integer getIsGame() {
		return this.isGame;
	}

	public void setIsGame(Integer isGame) {
		this.isGame = isGame;
	}

	@Column(name = "isNovel")
	public Integer getIsNovel() {
		return this.isNovel;
	}

	public void setIsNovel(Integer isNovel) {
		this.isNovel = isNovel;
	}

	@Column(name = "isComic")
	public Integer getIsComic() {
		return this.isComic;
	}

	public void setIsComic(Integer isComic) {
		this.isComic = isComic;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PublishDate", length = 10)
	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	@Column(name = "Editor")
	public Integer getEditor() {
		return this.editor;
	}

	public void setEditor(Integer editor) {
		this.editor = editor;
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

	@Column(name = "Ass")
	public Integer getAss() {
		return this.ass;
	}

	public void setAss(Integer ass) {
		this.ass = ass;
	}

	@Column(name = "isEnd")
	public Integer getIsEnd() {
		return this.isEnd;
	}

	public void setIsEnd(Integer isEnd) {
		this.isEnd = isEnd;
	}

	@Column(name = "isPublish")
	public Integer getIsPublish() {
		return this.isPublish;
	}

	public void setIsPublish(Integer isPublish) {
		this.isPublish = isPublish;
	}

	@Column(name = "isAge")
	public Integer getIsAge() {
		return this.isAge;
	}

	public void setIsAge(Integer isAge) {
		this.isAge = isAge;
	}

	@Column(name = "is3D")
	public Integer getIs3d() {
		return this.is3d;
	}

	public void setIs3d(Integer is3d) {
		this.is3d = is3d;
	}

	@Column(name = "isMovie")
	public Integer getIsMovie() {
		return this.isMovie;
	}

	public void setIsMovie(Integer isMovie) {
		this.isMovie = isMovie;
	}

	@Column(name = "IsCanDown")
	public Integer getIsCanDown() {
		return this.isCanDown;
	}

	public void setIsCanDown(Integer isCanDown) {
		this.isCanDown = isCanDown;
	}

	@Column(name = "Remark", length = 30)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "animates_1")
	public Set<Novels> getNovelses() {
		return this.novelses;
	}

	public void setNovelses(Set<Novels> novelses) {
		this.novelses = novelses;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "animates_1")
	public Set<Games> getGameses() {
		return this.gameses;
	}

	public void setGameses(Set<Games> gameses) {
		this.gameses = gameses;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "animates")
	public Set<Musics> getMusicses() {
		return this.musicses;
	}

	public void setMusicses(Set<Musics> musicses) {
		this.musicses = musicses;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "animates_1")
	public Set<Comics> getComicses() {
		return this.comicses;
	}

	public void setComicses(Set<Comics> comicses) {
		this.comicses = comicses;
	}

}
package com.ex.note;

import java.time.LocalDate;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.ex.category.Category;
import com.ex.tag.Tag;
import com.ex.user.User;

@Entity
@Table(name = "note")
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "note_id")
	private int noteId;
	
	@Column(name ="note_title")
	private String noteTitle;
	
	@Column(name="created_date")
	private LocalDate createDate;
	
	@Column(name="created_time")
	private LocalTime createTime;
	
	@Column(name="last_updated_date")
	private LocalDate lastUpdateDate;
	
	@Column(name="last_updated_time")
	private LocalTime lastUpdateTime;
	
	@Column(name="text")
	private String text;
	
	@ManyToOne
	@JoinColumn(name="user")
	private User user;
	
	@OneToMany
	@JoinColumn(name="tag")
	private List<Tag> tags;

	@ManyToOne
	@JoinColumn(name="category")
	private Category category;
	public String getNoteTitle() {
		return noteTitle;
	}

	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}


	public LocalDate getLastUpdateDate() {
		return lastUpdateDate;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}


	public int getNoteId() {
		return noteId;
	}

	public User getUser() {
		return user;
	}

	public void setUsers(User user) {
		this.user = user;
	}

	public LocalTime getCreateTime() {
		return createTime;
	}

	public LocalTime getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	

}

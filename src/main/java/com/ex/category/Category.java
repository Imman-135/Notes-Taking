package com.ex.category;

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

import com.ex.note.Note;
import com.ex.user.User;

@Entity
@Table(name = "category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private int categoryId;
	@Column(name = "category_name")
	private String categoryName;
	@Column(name = "description")
	private String description;

	@OneToMany
	@JoinColumn(name = "notes")
	private List<Note> notes;
	
	@ManyToOne
	@JoinColumn(name = "user")
	private User user;
	
	public String getCatogeryName(){
		return categoryName;
	}

	public void setCatogeryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	public int getCatogeryId() {
		return categoryId;
	}
}

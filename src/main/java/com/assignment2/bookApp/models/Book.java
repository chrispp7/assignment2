package com.assignment2.bookApp.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name, author, category, releaseDate, description;

    public Book(String name, String author, String category, String releaseDate, String description) {
	super();
	this.name = name;
	this.author = author;
	this.category = category;
	this.releaseDate = releaseDate;
	this.description = description;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getAuthor() {
	return author;
    }

    public void setAuthor(String author) {
	this.author = author;
    }

    public String getCategory() {
	return category;
    }

    public void setCategory(String category) {
	this.category = category;
    }

    public String getReleaseDate() {
	return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
	this.releaseDate = releaseDate;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    @Override
    public String toString() {
	return "Book [name=" + name + ", author=" + author + ", category=" + category + ", releaseDate=" + releaseDate
		+ ", description=" + description + "]";
    }
}

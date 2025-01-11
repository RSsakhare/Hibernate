package com.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Director {
    @Id
    private int directorId;
    @Column(name = "directorName",length = 20)
    private String directorName;

    @OneToMany(mappedBy = "dir", cascade = CascadeType.ALL)
    private Set<Movie> movies;

	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Director(int directorId, String directorName, Set<Movie> movies) {
		super();
		this.directorId = directorId;
		this.directorName = directorName;
		this.movies = movies;
	}
	
	// Getters and Setters
	public int getDirectorId() {
		return directorId;
	}

	public void setDirectorId(int directorId) {
		this.directorId = directorId;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public Set<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Director [directorId=" + directorId + ", directorName=" + directorName + ", movies=" + movies + "]";
	}
    
    
}


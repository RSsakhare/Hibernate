package com.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int movieId;
    @Column(name = "movieName",length = 20)
    private String movieName;
    @Temporal(TemporalType.DATE)
    private Date releaseDate;
    private float budget;

    @ManyToOne
    @JoinColumn(name = "directorId")
    private Director dir;

	public Movie() {
		
	}

	public Movie(int movieId, String movieName, Date releaseDate, float budget, Director dir) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.releaseDate = releaseDate;
		this.budget = budget;
		this.dir = dir;
	}
	
	// Getters and Setters
	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public float getBudget() {
		return budget;
	}

	public void setBudget(float budget) {
		this.budget = budget;
	}

	public Director getDir() {
		return dir;
	}

	public void setDir(Director dir) {
		this.dir = dir;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", releaseDate=" + releaseDate + ", budget="
				+ budget + ", dir=" + dir + "]";
	}
    
    
}


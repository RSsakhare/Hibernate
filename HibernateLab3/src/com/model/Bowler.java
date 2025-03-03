package com.model;

import javax.persistence.*;

@Entity 
@DiscriminatorValue("Bowler")
public class Bowler extends Player {
	
	@Column(name="numWickets",length = 5)
	private int numWickets;

	
	public Bowler() {
		super();
	}

	public Bowler(int playerId, String playerName, int numMatches, Address resAddr,int numWickets) {
		super(playerId, playerName, numMatches, resAddr);
		this.numWickets = numWickets;

	}

	public int getNumWickets() {
		return numWickets;
	}

	public void setNumWickets(int numWickets) {
		this.numWickets = numWickets;
	}

	@Override
	public String toString() {
		return "Bowler [numWickets=" + numWickets + ", getPlayerId()=" + getPlayerId() + ", getPlayerName()="
				+ getPlayerName() + ", getNumMatches()=" + getNumMatches() + ", getResAddr()=" + getResAddr()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
}

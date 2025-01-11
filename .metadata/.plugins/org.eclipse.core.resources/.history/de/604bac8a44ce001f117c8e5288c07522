package com.model;

import javax.persistence.*;

@Entity 
@DiscriminatorValue("Batsman")
public class Batsman extends Player {
	@Column(name="numRuns",length = 10)
	private int numRuns;

	public Batsman() {
		super();
	}

	public Batsman(int playerId, String playerName, int numMatches, Address resAddr,int numRuns) {
		super(playerId, playerName, numMatches, resAddr);
		this.numRuns = numRuns;
	}

	public int getNumRuns() {
		return numRuns;
	}

	public void setNumRuns(int numRuns) {
		this.numRuns = numRuns;
	}

	@Override
	public String toString() {
		return "Batsman [numRuns=" + numRuns + ", getPlayerId()=" + getPlayerId() + ", getPlayerName()="
				+ getPlayerName() + ", getNumMatches()=" + getNumMatches() + ", getResAddr()=" + getResAddr()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
}

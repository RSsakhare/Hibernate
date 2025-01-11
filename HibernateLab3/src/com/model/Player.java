package com.model;

import javax.persistence.*;

@Entity 
@Table(name = "PlayerDetails")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) 
@DiscriminatorColumn(name = "player_type",length = 15, discriminatorType = DiscriminatorType.STRING)
public class Player 
{
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="playerId",length = 5 )
	private int playerId;
	@Column(name = "playerName",length = 30)
	private String playerName;
	@Column(name = "numMatches",length = 10)
	private int numMatches;
	@Embedded
	private Address resAddr;
	
	public Player() {
		super();
	}
	
	public Player(int playerId, String playerName, int numMatches, Address resAddr) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.numMatches = numMatches;
		this.resAddr = resAddr;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getNumMatches() {
		return numMatches;
	}

	public void setNumMatches(int numMatches) {
		this.numMatches = numMatches;
	}

	public Address getResAddr() {
		return resAddr;
	}

	public void setResAddr(Address resAddr) {
		this.resAddr = resAddr;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", numMatches=" + numMatches
				+ ", resAddr=" + resAddr + "]";
	}
	
	
	
}

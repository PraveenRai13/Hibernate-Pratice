package com.sim;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Player {
	@Id
private int playerId;
private String playerName;
private String teamName;
private int age;

public Player() {
	// TODO Auto-generated constructor stub
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
public String getTeamName() {
	return teamName;
}
public void setTeamName(String teamName) {
	this.teamName = teamName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Player [playerId=" + playerId + ", playerName=" + playerName + ", teamName=" + teamName + ", age=" + age
			+ "]";
}
public Player(int playerId, String playerName, String teamName, int age) {
	super();
	this.playerId = playerId;
	this.playerName = playerName;
	this.teamName = teamName;
	this.age = age;
}

}

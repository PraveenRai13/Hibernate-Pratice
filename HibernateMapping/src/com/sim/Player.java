package com.sim;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class Player {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int teamId;
private String playerName;
//@OneToOne
//private Team team;
@OneToMany
List<Team> teamList = new ArrayList<>();

public List<Team> getTeamList() {
	return teamList;
}
public void setTeamList(List<Team> teamList) {
	this.teamList = teamList;
}
private int age;
 public Player() {
	// TODO Auto-generated constructor stub
}
public int getTeamId() {
	return teamId;
}
public void setTeamId(int teamId) {
	this.teamId = teamId;
}
public String getPlayerName() {
	return playerName;
}
public void setPlayerName(String playerName) {
	this.playerName = playerName;
}
//public Team getTeam() {
//	return team;
//}
//public void setTeam(Team team) {
//	this.team = team;
//}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
//public Player(String playerName, Team team, int age) {
//	super();
//	this.playerName = playerName;
//	this.team = team;
//	this.age = age;
//}
//@Override
//public String toString() {
//	return "Player [teamId=" + teamId + ", playerName=" + playerName + ", team=" + team + ", age=" + age + "]";
//}
public Player(String playerName, List<Team> teamList, int age) {
	super();
	this.playerName = playerName;
	this.teamList = teamList;
	this.age = age;
}
@Override
public String toString() {
	return "Player [teamId=" + teamId + ", playerName=" + playerName + ", teamList=" + teamList + ", age=" + age + "]";
}
 
}

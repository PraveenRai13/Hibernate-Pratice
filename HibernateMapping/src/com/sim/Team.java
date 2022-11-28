package com.sim;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Team {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int teamid;
	private String teamName;
	public Team() {
		// TODO Auto-generated constructor stub
	}
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Team(String teamName) {
		super();
		this.teamName = teamName;
	}

}
